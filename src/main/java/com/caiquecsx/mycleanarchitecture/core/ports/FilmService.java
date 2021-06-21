package com.caiquecsx.mycleanarchitecture.core.ports;

import com.caiquecsx.mycleanarchitecture.core.domain.Film;

import java.util.List;

public interface FilmService {

    public List<Film> getAllFilms();
}
