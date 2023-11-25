package ro.fasttrackit.Tema22.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.Tema22.model.Movie;
import ro.fasttrackit.Tema22.repository.MovieRepository;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieRepository repository;

    public MovieController(MovieRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Movie> getAllMovies(){
        return repository.findAll();
    }
}
