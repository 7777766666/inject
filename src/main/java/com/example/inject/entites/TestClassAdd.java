package com.example.inject.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Getter
@Setter
@Table(name = "a", schema = "test")
public class TestClassAdd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String name;

    @Column(name = "car_speed_super_turbo")
    private Integer speed;

    @Column(name = "new_price")
    private Integer newPrice;


    private void hello88(){
        System.out.println("8822 is first");
    }
    private void hello99(){
        System.out.println("9922 is second");
    }
}
