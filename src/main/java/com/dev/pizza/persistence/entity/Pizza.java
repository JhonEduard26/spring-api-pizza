package com.dev.pizza.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "pizzas")
@Getter
@Setter
@NoArgsConstructor
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 40)
    private String name;

    @Column(nullable = false, length = 120)
    private String description;

    @Column(columnDefinition = "numeric")
    private Double price;

    @Column(columnDefinition = "bool")
    private Boolean vegetarian;

    @Column(columnDefinition = "bool")
    private Boolean vegan;

    @Column(columnDefinition = "bool", nullable = false)
    private Boolean available;
}