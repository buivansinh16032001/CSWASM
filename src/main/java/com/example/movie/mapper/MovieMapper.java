package com.example.movie.mapper;

import com.example.movie.dto.MovieDto;
import com.example.movie.entity.MovieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MovieMapper {
    MovieDto convertToDto(MovieEntity movieEntity);
    MovieEntity convertToEntity(MovieDto movieDto);
}
