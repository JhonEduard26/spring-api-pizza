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
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, unique = true, length = 40)
    private String name;

    @Column(nullable = false, length = 120)
    private String description;

    @Column(columnDefinition = "numeric")
    private Double price;

    @Column(columnDefinition = "smallint")
    private Boolean vegetarian;

    @Column(columnDefinition = "smallint")
    private Boolean vegan;

    @Column(columnDefinition = "smallint", nullable = false)
    private Boolean available;
}