package com.dev.pizza.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "timestamp", nullable = false)
    private LocalDateTime date;

    @Column(columnDefinition = "numeric", nullable = false)
    private Double total;

    @Column(nullable = false, length = 40)
    private String method;

    @Column(name = "additional_notes", length = 120)
    private String additionalNotes;

    @Column(name = "id_customer", nullable = false)
    private Integer idCustomer;

    @OneToOne
    @JoinColumn(referencedColumnName = "id", name = "id_customer", insertable = false, updatable = false)
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<Item> items;
}
