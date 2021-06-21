package com.caiquecsx.mycleanarchitecture.infrastructure.adapters;

import com.caiquecsx.mycleanarchitecture.core.domain.Film;
import com.caiquecsx.mycleanarchitecture.core.ports.FilmService;
import com.caiquecsx.mycleanarchitecture.infrastructure.converters.FilmConverter;
import com.caiquecsx.mycleanarchitecture.infrastructure.database.repository.FilmRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;
    private final FilmConverter filmConverter;

    @Override
    public List<Film> getAllFilms() {
        return filmRepository.getAllFilms().stream().map(filmConverter::mapToEntity).collect(Collectors.toList());
    }
}
