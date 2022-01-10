package com.example.movie.mapper;

import com.example.movie.dto.CategoryDto;
import com.example.movie.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface CategoryMapper {
    CategoryDto convertToDto(CategoryEntity categoryEntity);
    CategoryEntity convertToEntity(CategoryDto userDto);
}
