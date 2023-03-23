package br.com.school.domains.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@RequiredArgsConstructor
@Builder
@Getter

@Entity
@Table(name = "TB_ADDRESSES")
public class Address implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private final UUID id;

    @Column(length = 128, nullable = false)
    private final String publicPlace;

    @Column(length = 32, nullable = false)
    private final String number;

    @Column(length = 32)
    private final String complement;

    @Column(length = 128, nullable = false)
    private final String neighborhood;

    @Column(length = 128, nullable = false)
    private final String city;

    @Column(length = 2, nullable = false)
    private final String state;

    @Column(length = 2, nullable = false)
    private final String country;

    @Column(length = 24, nullable = false)
    private final String zipcode;

    @NonNull
    @ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.REFRESH })
    @JoinColumn(name = "STUDENT_ID", referencedColumnName = "id")
    private Student student;

}
