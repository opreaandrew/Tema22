package ro.fasttrackit.Tema22.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.fasttrackit.Tema22.model.Movie;
import ro.fasttrackit.Tema22.model.MovieRating;
import ro.fasttrackit.Tema22.repository.MovieRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
}
