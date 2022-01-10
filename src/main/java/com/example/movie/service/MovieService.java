package com.example.movie.service;

import com.example.movie.dto.MovieDto;
import com.example.movie.entity.HomeContentEntity;
import com.example.movie.entity.MovieEntity;

import java.util.List;

public interface MovieService {
    List<MovieEntity> getLístMovie();
    MovieDto createMovie(MovieDto dto);
}
