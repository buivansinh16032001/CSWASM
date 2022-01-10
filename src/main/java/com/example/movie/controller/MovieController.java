package com.example.movie.controller;

import com.example.movie.dto.BaseResponse;
import com.example.movie.dto.HomeContentDto;
import com.example.movie.dto.MovieDto;
import com.example.movie.entity.HomeContentEntity;
import com.example.movie.entity.MovieEntity;
import com.example.movie.mapper.MovieMapper;
import com.example.movie.service.MovieService;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @Autowired
    MovieMapper movieMapper;

    @GetMapping("/api/movie")
    public ResponseEntity getListMovie() {
        BaseResponse<HomeContentEntity> response = new BaseResponse<>();
        List<MovieEntity> movieEntityList = movieService.getLístMovie();
        List<MovieEntity> listTrendings = new ArrayList<>();
        HomeContentEntity homeContentEntity = new HomeContentEntity();
        homeContentEntity.listTrending=movieEntityList;
        List<MovieEntity> listHot = new ArrayList<>();
//        homeContentEntity.listHot=movieEntityList;
//        List<MovieEntity> listSuggest = new ArrayList<>();
//        homeContentEntity.listSuggest = movieEntityList;
        String Category_Name="Hành Động";
//        movieEntityList.forEach(element -> {
//           String name = element.getCategory().getName();
//            if(name.equalsIgnoreCase(Category_Name)){
//                listTrendings.add(element);
//           }
//       });
        movieEntityList.forEach(element -> {
            String name = element.getCategory().getName();
            if(name.equalsIgnoreCase(Category_Name)){
                listTrendings.add(element);
            }else{
                listHot.add(element);
            }
        });
        homeContentEntity.listTrending=listTrendings;
        homeContentEntity.listHot=listHot;
        response.data = homeContentEntity;
        return ResponseEntity.ok(response);
    }
       @PostMapping("/api/movies")
    private ResponseEntity createMovie(@RequestBody MovieDto movieDto){
        BaseResponse res = new BaseResponse();
        res.data=movieService.createMovie(movieDto);
        return ResponseEntity.ok(res);
       }
}
