package ro.fasttrackit.Tema22.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldNameConstants;

import java.util.List;

import static jakarta.persistence.GenerationType.*;

@Entity
@Getter
@Setter
@FieldNameConstants
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private Integer releaseDate;

    @OneToOne(mappedBy = MovieRating.Fields.movie, cascade = CascadeType.ALL)
    private MovieRating movieRating;

    @OneToMany(mappedBy = Review.Fields.movie, cascade = CascadeType.ALL)
    private List<Review> reviews;

    @ManyToOne
    @JoinColumn(name = "studio_id")
    private Studio studio;

    @ManyToMany
    private List<Actor> actors;

}
