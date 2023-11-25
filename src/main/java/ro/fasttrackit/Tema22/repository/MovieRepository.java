package ro.fasttrackit.Tema22.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.Tema22.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
