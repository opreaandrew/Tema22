package ro.fasttrackit.Tema22.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

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

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    private MovieRating movieRating;

    @JsonIgnore
    @OneToMany(mappedBy = Review.Fields.movie, cascade = CascadeType.ALL)
    private List<Review> reviews;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "studio_id")
    private Studio studio;

    @JsonIgnore
    @ManyToMany
    private List<Actor> actors;

}
