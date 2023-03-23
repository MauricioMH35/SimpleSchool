package br.com.school.domains.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@RequiredArgsConstructor
@Builder
@Getter

@Entity
@Table(name = "TBL_GENDERS")
public class Gender implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer id;

    @Column(length = 64, nullable = false, unique = true)
    private final String orientation;

    @Column(length = 512)
    private final String description;

}
