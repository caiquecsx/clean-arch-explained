package com.caiquecsx.mycleanarchitecture.infrastructure.database.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilmDatabase implements Serializable {
    private String title;
    private String description;
    private String director;
    private String release_date;
}