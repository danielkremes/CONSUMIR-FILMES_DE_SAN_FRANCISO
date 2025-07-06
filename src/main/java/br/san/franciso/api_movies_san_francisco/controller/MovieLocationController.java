package br.san.franciso.api_movies_san_francisco.controller;

import br.san.franciso.api_movies_san_francisco.model.MovieLocation;
import br.san.franciso.api_movies_san_francisco.service.MovieLocationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/api_movies/san/francisco")
public class MovieLocationController {

    private final MovieLocationService service;

    public MovieLocationController(MovieLocationService service) {
        this.service = service;
    }

    @GetMapping
    public List<MovieLocation> showMovies () {
        return service.listMovies();
    }

    @GetMapping("/{year}")
    public List<MovieLocation> finderByYear(@PathVariable int year) {
        return service.filterByYear(year);
    }
}
