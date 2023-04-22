package ru.skzmk.backend.database.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.skzmk.backend.database.model.IEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "application")
public class Application implements IEntity<Integer> {

    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "application_id_generator")
    @SequenceGenerator(name = "application_id_generator", allocationSize = 1)
    @Column(name = "id", nullable = false)
    Integer id;

    @NotBlank
    @Column(name = "title", nullable = false)
    String title;

    @NotBlank
    @Column(name = "description", nullable = false)
    String description;

//    @NotNull
//    @M(optional = false)
//    @JoinColumn(name = "user_id", nullable = false)
//    User user;

    @Positive
    @Column(name = "days", nullable = false)
    Integer days;

    @Positive
    @Column(name = "price", nullable = false)
    Integer price;
}