package ro.fasttrackit.Tema22.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.Tema22.model.Movie;
import ro.fasttrackit.Tema22.repository.MovieRepository;
import ro.fasttrackit.Tema22.service.MovieService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieController {
    private final MovieService service;


    @GetMapping
    public List<Movie> getAllMovies(){
        return service.allMovies();
    }
}
