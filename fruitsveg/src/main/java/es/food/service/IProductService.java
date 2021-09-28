package es.food.service;

import java.util.List;

import es.food.dao.Product;
import es.food.dto.ProductDTO;


public interface IProductService {

	public ProductDTO createProduct(ProductDTO productDto);
	
	public Product createProduct(Product product);

	public List<ProductDTO> getProducts();
	
	public List<ProductDTO> getProductsByCategoryName(String name);

	public  ProductDTO findProductById(int id);

	public ProductDTO updateProduct( ProductDTO product);

	public void deleteProduct(int id);

}
