package com.caiquecsx.mycleanarchitecture.infrastructure.database.repository;

import com.caiquecsx.mycleanarchitecture.infrastructure.database.model.FilmDatabase;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FilmRepository {

    public List<FilmDatabase> getAllFilms() {
        var film1 = FilmDatabase.builder()
                .title("My Neighbor Totoro")
                .description("Two sisters move to the country with their father in order to be closer to their hospitalized mother, and discover the surrounding trees are inhabited by Totoros, magical spirits of the forest. When the youngest runs away from home, the older sister seeks help from the spirits to find her.")
                .director("Hayao Miyazaki")
                .release_date("1988")
                .build();
        var film2 = FilmDatabase.builder()
                .title("Spirited Away")
                .description("Ten-year-old Chihiro and her parents are traveling to their new home. Her father, a man who loves to take shortcuts, ends up in front of a tunnel leading to what appears to be an abandoned themepark, which Chihiro's father insists on exploring despite his daughter's misgivings.")
                .director("Hayao Miyazaki")
                .release_date("2001")
                .build();

        return List.of(film1, film2);
    }
}
