package com.keith.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keith.productsandcategories.models.Category;
import com.keith.productsandcategories.models.Product;
import com.keith.productsandcategories.repository.CategoryRepository;
import com.keith.productsandcategories.repository.ProductRepository;

@Service
public class AppServices {

		@Autowired
		private ProductRepository pRepo;
	
		@Autowired
		private CategoryRepository cRepo;
		
		public Product createProduct(Product product) {
			return this.pRepo.save(product);
		}
		
		public Category createCategory(Category category) {
			return this.cRepo.save(category);
		}
		
		public Product getSingleProduct(Long id) {
			return this.pRepo.findById(id).orElse(null);
		}
		
		public Category getSingleCategory(Long id) {
			return this.cRepo.findById(id).orElse(null);
		}
		
		public List<Category> findNonGroupedCat(Product product){
			return this.cRepo.findByProductsNotContains(product);
		}
		
		public List<Product> findNonGroupedProd(Category category){
			return this.pRepo.findByCategoriesNotContains(category);
		}
		
		public void addCategoryToProduct(Product product, Category category) {
			List<Category> existingCategory = product.getCategories();
			existingCategory.add(category);
			this.pRepo.save(product);
		}
		
		public void addProductToCategory(Product product, Category category) {
			List<Product> existingProduct = category.getProducts();
			existingProduct.add(product);
			this.cRepo.save(category);
		}
		
}
