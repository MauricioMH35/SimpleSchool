package br.com.school.domains.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@RequiredArgsConstructor
@Builder
@Getter

@Entity
@Table(name = "TB_CONTACTS")
public class Contact implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private final UUID id;

    @NonNull
    @EmbeddedId
    @Column
    private ContactType type;

    @Column(nullable = false, unique = true)
    private final String contactValue;

    @Column(nullable = false)
    private final LocalDateTime registered;

    @NonNull
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "STUDENT_ID", referencedColumnName = "id")
    private Student student;

}
