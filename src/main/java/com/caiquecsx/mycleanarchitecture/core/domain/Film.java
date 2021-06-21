package com.caiquecsx.mycleanarchitecture.core.domain;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Film implements Serializable {
    private String title;
    private String description;
    private String director;
    private String release_date;
}
