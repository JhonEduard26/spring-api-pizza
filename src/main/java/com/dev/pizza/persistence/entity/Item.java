package com.dev.pizza.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "items")
@IdClass(ItemId.class)
@Getter
@Setter
@NoArgsConstructor
public class Item {

    @Id
    @Column(name = "id_item", nullable = false)
    private String idItem;

    @Id
    @Column(name = "id_order", nullable = false)
    private String idOrder;

    @Column(columnDefinition = "numeric", nullable = false)
    private Double quantity;

    @Column(columnDefinition = "numeric", nullable = false)
    private Double price;

    @Column(name = "id_pizza", nullable = false)
    private String idPizza;
}
