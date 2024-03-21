package com.springreact.test.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.springreact.test.dto.GetProduct;
import com.springreact.test.entity.Product;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = CategoryMapper.class)
public interface ProductMapper {

	
	@Mappings({ 
		@Mapping(source = "name", target = "productName"),
		@Mapping(source = "id", target = "productId"),

		@Mapping(source = "category", target = "productCategory"),
/*
 * Ignora el atributo productCategory, lo llena con null		
		@Mapping( target = "productCategory", ignore=true ),
*/		
		@Mapping(source = "creationDate", target = "creationDate", dateFormat = "dd-MM-yyyy HH:mm:ss"),
		})
GetProduct ToGetDTO(Product product);


@InheritInverseConfiguration
Product ToProduct(GetProduct getProduct);

List<GetProduct> toGetProductList(List<Product> productList);

List<Product> toProductList(List<GetProduct> productList);
}
