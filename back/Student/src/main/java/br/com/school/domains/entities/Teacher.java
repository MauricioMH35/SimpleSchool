package br.com.school.domains.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@RequiredArgsConstructor
@Builder
@Getter
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1l;

    private final UUID id;
    private final String fullname;

    // todo: continue implement attributes

}
