package com.springreact.test.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

import com.springreact.test.dto.GetCategory;
import com.springreact.test.entity.Category;
import com.springreact.test.repository.CategoryRepository;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class CategoryMapper {
	
	@Autowired 
	private CategoryRepository categoryRepository;
	
	@Mappings({ 
		@Mapping(source = "name", target = "categoryName"),
		@Mapping(source = "id", target = "categoryId"),
		})
	abstract GetCategory toGetCategory(Category category);
	
	Category toCategory(GetCategory getCategory) {
		
		// si el getCategoria es null, entonces la categoria va a ser null
		if(getCategory == null) return null;
		/* busca la entidad categoria segun el id del DTO GetCategoria, si no lo encuentra retorna categoria null, 
		Si encuentra la categoria va a tener todos los atributos que estan en la bd, en este ej el dto no contaba con
		el atributo status, al traer la entidad Category va a contar con su atributo correspondiente*/
		Category category = categoryRepository.findById(getCategory.getCategoryId()).orElse(null);
		
		if (category == null) return null;
		/*
		 * Setea los atributos de DTO en la Entidad persistida y la retorna
		 */
		category.setId(getCategory.getCategoryId());
		category.setName(getCategory.getCategoryName());
		
		return category;
	}
	
	abstract List<GetCategory> toGetCategoryList(List<Category> categoryList);
	
	abstract List<Category> toCategoryList(List<GetCategory> getCategoryList);
}
