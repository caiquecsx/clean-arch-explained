package com.caiquecsx.mycleanarchitecture.infrastructure.converters;

import com.caiquecsx.mycleanarchitecture.core.domain.Film;
import com.caiquecsx.mycleanarchitecture.infrastructure.database.model.FilmDatabase;
import com.caiquecsx.mycleanarchitecture.infrastructure.shared.Converter;
import org.springframework.stereotype.Component;

@Component
public class FilmConverter implements Converter<FilmDatabase, Film> {

    @Override
    public Film mapToEntity(FilmDatabase entity) {
        return Film.builder()
                .title(entity.getTitle())
                .description(entity.getDescription())
                .director(entity.getDirector())
                .release_date(entity.getRelease_date())
                .build();
    }

    @Override
    public FilmDatabase mapToDatabase(Film entity) {
        return FilmDatabase.builder()
                .title(entity.getTitle())
                .description(entity.getDescription())
                .director(entity.getDirector())
                .release_date(entity.getRelease_date())
                .build();
    }
}
