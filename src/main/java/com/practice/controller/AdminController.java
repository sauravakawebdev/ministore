package com.practice.controller;

import java.io.IOException;
import java.util.List;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;
import com.practice.FileUploadUtils;
import com.practice.entity.AdminUser;
import com.practice.entity.BillingAddress;
import com.practice.entity.Categories;
import com.practice.entity.Products;
import com.practice.repositry.AdminUserRepository;
import com.practice.services.AdminService;
import com.practice.services.BillingAddressService;
import com.practice.services.CategoriesService;
import com.practice.services.CustomerUserService;
import com.practice.services.ProductService;

import org.springframework.util.StringUtils;

@Controller
public class AdminController {

	@Autowired
	private AdminUserRepository adminUserRepository;
	
	@Autowired
	private AdminService adminService;

	@Autowired
	private ProductService productservice;

	@Autowired
	private CategoriesService categories;
	
	@Autowired
	private CustomerUserService customerUserService;
	
	@Autowired
	private BillingAddressService billingAddressService;
	

	@RequestMapping("/adminlogin")
	public String adminlogin() {
		return "adminlogin1";
	}

	@PostMapping("/admin")
	public String handleAdminLogin(@ModelAttribute AdminUser adminUser, HttpServletRequest request, Model model) {
		System.out.println(adminUser);
		AdminUser adminUser1 = adminService.authenticateAdminUser(adminUser.getUserName(), adminUser.getPass());

		if (adminUser1 != null) {
			//return "adminpanel";
			HttpSession session =  request.getSession();
			session.setAttribute("adminUser1", adminUser1);
			//session.setAttribute("products", productservice.findAll());
			//session.setAttribute("Customer", customerUserService.findAll());
			model.addAttribute("products", productservice.findAll());
			model.addAttribute("productCount", productservice.countProduct());
			model.addAttribute("Customer", customerUserService.findAll());
			model.addAttribute("customerCount", customerUserService.countCustomer());
			model.addAttribute("countOrder", billingAddressService.countOrder());
			
			return "admin1";
		}
		/*
		 * if (adminUser.getUserName().equals("admin") &&
		 * adminUser.getPass().equals("admin")) { return "adminpanel"; }
		 */

		model.addAttribute("message", "Invalid Credentials");
		return "adminlogin1";

	}
	
	@RequestMapping("/adminpanel")
	public String adminPanel(HttpServletRequest request,Model model) {
		HttpSession session = request.getSession();
		if (session.getAttribute("adminUser1") != null) {
			model.addAttribute("products", productservice.findAll());
			model.addAttribute("Customer", customerUserService.findAll());
			model.addAttribute("productCount", productservice.countProduct());
			model.addAttribute("countOrder", billingAddressService.countOrder());
			model.addAttribute("customerCount", customerUserService.countCustomer());
			return "admin1";
		}
			
		
		return "redirect:/adminlogin";
	}
	
	@RequestMapping("/adminLogout")
	public String adminLogout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/adminlogin";
	}

	@GetMapping("/admin/addproduct")
	public String addproduct(Model model) {

//		Categories categories = new Categories();

		Products product = new Products();

		// List<String> Cateories = Arrays.asList("Mobile", "Laptop");

		model.addAttribute("product", product);
		model.addAttribute("Categories", categories.findAll());
		// System.out.println(Categories);

//		for( Categories element : categories.findAll()){
//		   System.out.println( element.getType());
//			model.addAttribute("Categories",element.getType());
//		}
//		

		// System.out.println(categories);
		return "addproduct1";
	}
	
	@PostMapping("/admin/successaddproduct")
	public String addNewProduct(@ModelAttribute("product")  Products products,
						@RequestParam("image") MultipartFile multipartFile,
						BindingResult result, Model model) throws IOException {
		if (result.hasErrors()) {
			return "addproduct";
		}
		
		if (products != null) {
			String filename = StringUtils.cleanPath(multipartFile.getOriginalFilename());
			
			String uploadDir = "src/main/webapp/images/product";
			FileUploadUtils.saveFile(uploadDir, filename, multipartFile);
			products.setProductimage("images/product/" + filename);
			productservice.saveAll(products);
			
		}
		return "redirect:/adminpanel";
	}
	
	
	  @RequestMapping("/editProduct/{pId}") 
	  public String edit(@PathVariable("pId") String pId, Model model){
		  Products product = productservice.getById(pId);
		  model.addAttribute("product", product);
			model.addAttribute("Categories", categories.findAll());
		  return "editProduct";
	  }
	  
	  @PostMapping("/admin/successeditproduct")
		public String editProduct(@ModelAttribute  Products products,
							@RequestParam("PrdId") String PrdId,
							@RequestParam("image") MultipartFile multipartFile,
							BindingResult result, Model model) throws IOException {
			if (result.hasErrors()) {
				return "editProduct";
			}
			
			if (products != null) {
				Products products1 = productservice.getById(PrdId);
				//products1.setProductName(products.getProductName());
				products1.setPrice(products.getPrice());
				products1.setProductDescription(products.getProductDescription());
				//products.setCategories(products.getCategories());
				String filename = StringUtils.cleanPath(multipartFile.getOriginalFilename());
				
				String uploadDir = "src/main/webapp/images/product";
				FileUploadUtils.saveFile(uploadDir, filename, multipartFile);
				products1.setProductimage("images/product/" + filename);
				productservice.saveAll(products1);
				
			}
			return "redirect:/adminpanel";
		}
	 
	
	@RequestMapping("/viewProduct")
	public String viewProduct(Model model) {
		model.addAttribute("products", productservice.findAll());
		return "viewProduct";
	}
	
	/* @PutMapping("/deleteProduct/{pId}") */
	/* @RequestMapping(value="/deleteProduct/{pId}", method=RequestMethod.DELETE) */
	/* @DeleteMapping("/deleteProduct/{pId}") */
	@RequestMapping("/deleteProduct/{pId}")
	public String deleteProduct(@PathVariable String pId, Model model) {
		Products products = productservice.getById(pId);
		productservice.deleteById(products);
		/*
		 * model.addAttribute("products", productservice.findAll()); return
		 * "viewProduct";
		 */
		
		return "redirect:/adminpanel";
		
	}
	
	@RequestMapping("/addCategories")
	public String addCategories() {
		return "addCategories";
	}
	
	@PostMapping("/admin/successCategory")
		public String addCategories(@ModelAttribute Categories categories1) {
			categories.saveAll(categories1);
			return "redirect:/adminpanel";
			
		}
	

	/*
	 * @PostMapping("/admin/successaddproduct") public String
	 * addproduct(@ModelAttribute Products products, Model model
	 * , @RequestParam("productimage1") CommonsMultipartFile file ) {
	 * 
	 * // System.out.println(products); //
	 * 
	 * System.out.println(file.getSize());
	 * System.out.println(file.getContentType());
	 * System.out.println(file.getName());
	 * System.out.println(file.getOriginalFilename());
	 * System.out.println(file.getStorageDescription());
	 * 
	 * //System.out.println(file.); productservice.saveAll(products);
	 * model.addAttribute("message","successful");
	 * 
	 * //System.out.println(model);
	 * 
	 * return "successaddproduct"; }
	 */

	/*
	 * @PostMapping("/adminlogin") public String
	 * adminlogin(@RequestParam("user_name") String userNameAdminUser,
	 * 
	 * @RequestParam("password") String userPassAdminUser) {
	 * System.out.println("Admin : " + userNameAdminUser);
	 * System.out.println("Password : " + userPassAdminUser);
	 * 
	 * return "adminpanel";
	 * 
	 * }
	 */ 
}
