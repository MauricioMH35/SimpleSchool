package br.com.school.domains.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@RequiredArgsConstructor
@Builder
@Getter
public class Subject implements Serializable {

    private static final long serialVersionUID = 1l;

    private final UUID id;
    private final String title;
    private final String description;
    @NonNull private Teacher teacher;
    private final LocalDateTime registered;
    private final Boolean active;

}
