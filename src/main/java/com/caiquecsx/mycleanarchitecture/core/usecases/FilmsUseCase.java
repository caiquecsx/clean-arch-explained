package com.caiquecsx.mycleanarchitecture.core.usecases;

import com.caiquecsx.mycleanarchitecture.core.domain.Film;
import com.caiquecsx.mycleanarchitecture.core.ports.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FilmsUseCase {

    private final FilmService filmService;

    public List<Film> getAllFilms(){
        return filmService.getAllFilms();
    }
}
