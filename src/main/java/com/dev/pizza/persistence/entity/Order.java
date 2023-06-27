package com.dev.pizza.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(columnDefinition = "timestamp", nullable = false)
    private LocalDateTime date;

    @Column(columnDefinition = "numeric", nullable = false)
    private Double total;

    @Column(nullable = false, length = 40)
    private String method;

    @Column(name = "additional_notes", length = 120)
    private String additionalNotes;

    @Column(name = "id_customer", nullable = false)
    private String idCustomer;
}
