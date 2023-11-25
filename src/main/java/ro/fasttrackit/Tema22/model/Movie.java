package ro.fasttrackit.Tema22.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private int year;

    @OneToOne(mappedBy = "movie", cascade = CascadeType.ALL)
    private MovieRating movieRating;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Review> reviews;

    @ManyToOne
    private Studio studio;
    @ManyToMany
    private List<Actor> actors;

}
