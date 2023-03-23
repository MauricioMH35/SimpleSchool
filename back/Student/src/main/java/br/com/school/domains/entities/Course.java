package br.com.school.domains.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@RequiredArgsConstructor
@Builder
@Getter
public class Course implements Serializable {

    private static final long serialVersionUID = 1l;

    private final UUID id;
    private final String title;
    private final String description;
    @NonNull private Set<Subject> subjects = new HashSet<>();
    private final LocalDateTime registered;
    private final Boolean active;

}
