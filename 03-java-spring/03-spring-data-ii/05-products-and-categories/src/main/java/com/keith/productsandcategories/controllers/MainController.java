package com.keith.productsandcategories.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.keith.productsandcategories.models.Category;
import com.keith.productsandcategories.models.Product;
import com.keith.productsandcategories.services.AppServices;

@Controller
public class MainController {

	@Autowired
	private AppServices aServices;
	
	@GetMapping("/product/new")
	public String newProduct() {
		return "/product/newproduct.jsp";
	}
	
	@GetMapping("/category/new")
	public String newCateogry() {
		return "/category/newcategory.jsp";
	}
	
	@PostMapping("/product/new/create")
	public String makeProduct(@RequestParam("name") String product, @RequestParam("description") String description, @RequestParam("price") float price) {
		Product newProduct = new Product(product, description, price);
		newProduct.setName(product);
		this.aServices.createProduct(newProduct);
		return "redirect:/product/new";	
	}
	
	@PostMapping("/category/new/create")
	public String makeCategory(@RequestParam("name") String category) {
		Category newCategory = new Category();
		newCategory.setName(category);
		this.aServices.createCategory(newCategory);
		return "redirect:/category/new";	
	}
	
	@GetMapping("product/{id}")
	public String showProduct(@PathVariable("id") Long id, Model viewModel) {
		Product	displayProduct = this.aServices.getSingleProduct(id);
		List<Category> notGrouped = aServices.findNonGroupedCat(displayProduct);
		viewModel.addAttribute("nonGroupedCategory", notGrouped);
		viewModel.addAttribute("product", displayProduct);
		return "product/product.jsp";
	}
	
	@PostMapping("/addCategoryToProduct/{id}")
	public String addCatToProd(@RequestParam("categories") Long id, @PathVariable("id") Long productId) {
		Product prodToAddCatTo = this.aServices.getSingleProduct(productId);
		Category categoryToAdd = this.aServices.getSingleCategory(id);
		this.aServices.addCategoryToProduct(prodToAddCatTo, categoryToAdd);
		return "redirect:/product/{id}";
	}
	
	@GetMapping("category/{id}")
	public String showCategory(@PathVariable("id") Long id, Model viewModel) {
		Category displayCategory = this.aServices.getSingleCategory(id);
		List<Product> notGrouped = aServices.findNonGroupedProd(displayCategory);
		viewModel.addAttribute("nonGroupedProduct", notGrouped);
		viewModel.addAttribute("category", displayCategory);
		return "category/category.jsp";
	}
	
	@PostMapping("/addProductToCategory/{id}")
	public String addProdToCat(@RequestParam("products") Long id, @PathVariable("id") Long productId) {
		Category catToAddProdTo = this.aServices.getSingleCategory(productId);
		Product productToAdd = this.aServices.getSingleProduct(id);
		this.aServices.addProductToCategory(productToAdd, catToAddProdTo);
		return "redirect:/category/{id}";
	}
	
}
