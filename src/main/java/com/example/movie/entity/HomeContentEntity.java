package com.example.movie.entity;

import java.util.List;

public class HomeContentEntity {
    public List<MovieEntity> listTrending;
    public List<MovieEntity> listHot;
    public List<MovieEntity> listSuggest;
    public List<MovieEntity> listWatch;
    public HomeContentEntity(List<MovieEntity> listTrending) {
        this.listTrending = listTrending;
    }
    public HomeContentEntity() {
    }
}
