package com.example.movie.service;

import com.example.movie.dto.MovieDto;
import com.example.movie.entity.HomeContentEntity;
import com.example.movie.entity.MovieEntity;
import com.example.movie.mapper.MovieMapper;
import com.example.movie.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImp implements MovieService {

    @Autowired
    MovieRepo movieRepo;
    @Autowired
    MovieMapper movieMapper;
    @Override
    public List<MovieEntity> getLístMovie() {

        return movieRepo.findAll();
    }

    @Override
    public MovieDto createMovie(MovieDto dto) {
        MovieEntity entity=movieMapper.convertToEntity(dto);
        MovieEntity movieEntity=movieRepo.save(entity);
        MovieDto movieDto=movieMapper.convertToDto(movieEntity);
        return movieDto;
    }
}
