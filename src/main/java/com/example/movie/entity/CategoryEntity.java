package com.example.movie.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<MovieEntity> movie;

    public CategoryEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MovieEntity> getMovie() {
        return movie;
    }

    public void setMovie(List<MovieEntity> movie) {
        this.movie = movie;
    }
}
