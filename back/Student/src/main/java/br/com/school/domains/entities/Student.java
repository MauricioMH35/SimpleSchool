package br.com.school.domains.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@RequiredArgsConstructor
@Builder
@Getter

@Entity
@Table(name = "TB_STUDENTS")
public class Student implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private final UUID id;

    @Column(length = 128, nullable = false)
    private final String fullname;

    @Column(length = 11, nullable = false, unique = true)
    private final String document;

    @NonNull
    @EmbeddedId
    @Column(nullable = false)
    private Gender gender;

    @Column(nullable = false)
    private final LocalDate birth;

    @NonNull
    @OneToMany(mappedBy = "student")
    @Column
    private Set<Contact> contacts = new HashSet<>();

    @NonNull
    @OneToMany(mappedBy = "student")
    @Column
    private Set<Address> addresses = new HashSet<>();

    @Column
    private final LocalDateTime registered;

    @Column(length = 128, nullable = false, unique = true)
    private final String matriculation;

}
