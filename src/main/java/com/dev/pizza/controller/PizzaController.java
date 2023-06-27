package com.dev.pizza.controller;

import com.dev.pizza.persistence.entity.Pizza;
import com.dev.pizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pizzas")
public class PizzaController {
    private final PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping
    public ResponseEntity<List<Pizza>> findAll() {
        return ResponseEntity.ok(this.pizzaService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Pizza> findOneById(@PathVariable Integer id){
        Pizza pizza = this.pizzaService.findOneById(id);

        if (pizza != null) {
            return ResponseEntity.ok(pizza);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
