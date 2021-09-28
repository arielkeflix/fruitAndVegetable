package es.food.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.food.dao.Product;
import es.food.dto.ProductDTO;
import es.food.exceptions.ArgumentNotFoundException;
import es.food.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository productRepository;
	
	ModelMapper modelMapper = new ModelMapper();
	
	
	@Override
	public Product createProduct(Product product) {
//		checkProductName(productDto.getName());
//		checkProductPriceAndWholesalePrice(productDto.getPrice(), productDto.getWholesalePrice());
	//	setProductCreatedAndModified(productDto);
	//	Product product = mapProductDtoToProductWithoutCategories(productDto);
//		product.setCategories(mapCategoriesDtoToCategories(productDto.getCategories()));
		return	productRepository.save(product);
		//return modelMapper.map(product, ProductDTO.class);
	}

	@Override
	public List<ProductDTO> getProducts() {
		if (productRepository.findAll().isEmpty()) throw new ArgumentNotFoundException("No products found");
		return productRepository.findAll()
				.stream()
				.collect(Collectors.mapping(product -> modelMapper
				.map(product, ProductDTO.class), Collectors.toList()));
	}

	@Override
	public List<ProductDTO> getProductsByCategoryName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO findProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO updateProduct(ProductDTO product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public ProductDTO createProduct(ProductDTO productDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
