package br.san.franciso.api_movies_san_francisco.service;

import br.san.franciso.api_movies_san_francisco.model.MovieLocation;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieLocationService {

    private final WebClient client;

    public MovieLocationService(WebClient.Builder client) {
        this.client = client.baseUrl("https://data.sfgov.org/resource/yitu-d5am.json").build();
    }

    public List<MovieLocation> listMovies() {
        return client.get().retrieve().bodyToFlux(MovieLocation.class).collectList().block();
    }

    public List<MovieLocation> filterByYear(int year) {
        return listMovies().stream()
                .filter(m -> m.getRelease_year() == year)
                .collect(Collectors.toList());
    }



}
