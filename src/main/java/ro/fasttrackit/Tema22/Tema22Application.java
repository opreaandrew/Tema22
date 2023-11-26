package ro.fasttrackit.Tema22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tema22Application {

    public static void main(String[] args) {
        SpringApplication.run(Tema22Application.class, args);
    }


	/*

-- Insert studios
INSERT INTO Studio (name, address) VALUES ('Warner Bros.', 'Hollywood, CA');
INSERT INTO Studio (name, address) VALUES ('Paramount Pictures', 'Los Angeles, CA');

-- Insert movies
INSERT INTO Movie (name, RELEASE_DATE, STUDIO_ID) VALUES ('Forrest Gump', 1994, 1);
INSERT INTO Movie (name, RELEASE_DATE, STUDIO_ID) VALUES ('The Matrix', 1999, 2);
INSERT INTO Movie (name, RELEASE_DATE, STUDIO_ID) VALUES ('Titanic', 1997, 1);

-- Insert actors
INSERT INTO Actor (name, BIRTH_YEAR) VALUES ('Tom Hanks', 1956);
INSERT INTO Actor (name, BIRTH_YEAR) VALUES ('Julia Roberts', 1967);
INSERT INTO Actor (name, BIRTH_YEAR) VALUES ('Will Smith', 1968);

-- Insert reviews
INSERT INTO Review (text, reviewer, movie_id) VALUES ('An absolute classic!', 'MovieBuff123', 1);
INSERT INTO Review (text, reviewer, movie_id) VALUES ('Mind-bending and revolutionary!', 'SciFiGeek', 2);
INSERT INTO Review (text, reviewer, movie_id) VALUES ('Epic romance, a must-watch!', 'LoveStoryFan', 3);

-- Insert movie ratings
INSERT INTO MOVIE_RATING (rating, agency, movie_id) VALUES (5, 'IMDb', 1);
INSERT INTO MOVIE_RATING (rating, agency, movie_id) VALUES (4, 'Rotten Tomatoes', 2);
INSERT INTO MOVIE_RATING (rating, agency, movie_id) VALUES (5, 'IMDb', 3);

	 */
}
