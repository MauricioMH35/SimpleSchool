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
@Table(name = "TB_CONTACT_HAS_TYPES")
public class ContactType implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer id;

    @Column(length = 32, nullable = false, unique = true)
    private final String title;

    @Column
    private final String description;

}
