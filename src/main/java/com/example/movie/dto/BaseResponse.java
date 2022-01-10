package com.example.movie.dto;

import com.example.movie.entity.MovieEntity;

import java.util.List;
import java.util.Map;

public class BaseResponse<T> {
    public int status =1;
    public String message ="Success";
    public T data;
}
