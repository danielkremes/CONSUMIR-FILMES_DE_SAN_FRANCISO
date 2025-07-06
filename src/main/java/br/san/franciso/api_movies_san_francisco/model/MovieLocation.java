package br.san.franciso.api_movies_san_francisco.model;

import lombok.Data;

@Data
public class MovieLocation {
    private String title;
    private int release_year;
    private String locations;
    private String production_company;
    private String director;
    private String actor_1;
    private String actor_2;
    private String actor_3;
}
