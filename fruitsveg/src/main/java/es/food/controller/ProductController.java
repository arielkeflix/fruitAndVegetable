package es.food.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.food.dao.Product;
import es.food.dto.ProductDTO;
import es.food.service.ProductServiceImpl;


@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	ProductServiceImpl productService;
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping
	public HashMap<String, Object> getProducts() {

		HashMap<String, Object> map = new HashMap<String, Object>();

		try {

			List<ProductDTO> productList = productService.getProducts();

			map.put("success", "true");
			map.put("message", "products found");
			map.put("products", productList);

		} catch (Exception e) {
			map.put("success", "false");
			map.put("message", "error: " + e.getMessage());
		}

		return map;
	}
	@PostMapping
	public HashMap<String, Object> createProduct(@RequestBody Product product) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		try {
			productService.createProduct(product);
			map.put("success", "true");
			map.put("message", "product created");
			map.put("product", product);
		} catch (Exception e) {
			map.put("success", "false");
			map.put("message", "error: " + e.getMessage());
		}
		return map;
	}

}
