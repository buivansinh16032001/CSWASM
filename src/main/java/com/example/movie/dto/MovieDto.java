package com.example.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
    private int id;
    private String name;
    private String image;
    private String author;
    private String description;
    private int categoryid;
}
