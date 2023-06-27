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
    private Integer idItem;

    @Id
    @Column(name = "id_order", nullable = false)
    private Integer idOrder;

    @Column(columnDefinition = "numeric", nullable = false)
    private Double quantity;

    @Column(columnDefinition = "numeric", nullable = false)
    private Double price;

    @Column(name = "id_pizza", nullable = false)
    private Integer idPizza;

    @OneToOne
    @JoinColumn(referencedColumnName = "id", name = "id_pizza", insertable = false, updatable = false)
    private Pizza pizza;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id", name = "id_order", insertable = false, updatable = false)
    private Order order;
}
