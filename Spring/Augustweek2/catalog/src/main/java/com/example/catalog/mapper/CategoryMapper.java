package com.example.catalog.mapper;

import com.example.catalog.Entities.Category;
import com.example.catalog.dto.category.CategoryDto;

public class CategoryMapper {


    public static CategoryDto toDTO(Category c){


        return new CategoryDto(c.getId(),c.getName(),c.getDescription());
    }


}
