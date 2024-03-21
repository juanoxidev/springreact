package com.springreact.test.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springreact.test.dto.GetProduct;
import com.springreact.test.entity.Product;
import com.springreact.test.mapper.ProductMapper;
import com.springreact.test.repository.ProductRepository;

@Configuration
public class InitDatabase {

	@Autowired 
	private ProductRepository productRepository;
	
	/*
	 * inyectamos el product mapper
	 */
	@Autowired
	private ProductMapper pMapper;
	
	/*
	 * Al iniciar la app podemos hacer que se ejecute este codigo
	 */
	@Bean
	public CommandLineRunner testProductMappedCommand() {
		return args -> {
			
			List<Product> products = productRepository.findAll();
			
			System.out.println("PRODUCTS");
			products.forEach(System.out::println);
			
			System.out.println("GET PRODUCT DTO");
			List<GetProduct> getProductList = pMapper.toGetProductList(products);
			getProductList.forEach(System.out::println);
			
			System.out.println("MAPPED PRODUCT");
			List<Product> mappedProducts = pMapper.toProductList(getProductList);
			mappedProducts.forEach(System.out::println);
		};
	}
}
