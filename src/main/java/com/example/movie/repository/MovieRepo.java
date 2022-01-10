package com.example.movie.repository;

import com.example.movie.dto.HomeContentDto;
import com.example.movie.entity.HomeContentEntity;
import com.example.movie.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<MovieEntity,Integer> {
}
