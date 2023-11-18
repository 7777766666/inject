package com.example.inject.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;


@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Getter
@Setter
//@RequiredArgsConstructor
@Table(name = "a", schema = "test")
public class A extends BaseAAndB{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "x", nullable = false)
    private Integer x;

    @Column(name = "create_date")
    private LocalDateTime localDateTime;

}
