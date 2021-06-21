package com.caiquecsx.mycleanarchitecture.infrastructure.controllers;

import com.caiquecsx.mycleanarchitecture.core.domain.Film;
import com.caiquecsx.mycleanarchitecture.core.usecases.FilmsUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class GhibliController {

    private final FilmsUseCase filmsUseCase;

    @GetMapping("/")
    List<Film> getAllFilms(){
        return filmsUseCase.getAllFilms();
    }
}
