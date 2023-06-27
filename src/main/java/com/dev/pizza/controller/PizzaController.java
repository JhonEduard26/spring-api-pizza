package com.dev.pizza.controller;

import com.dev.pizza.persistence.entity.Pizza;
import com.dev.pizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return ResponseEntity.ok(this.pizzaService.findOneById(id));
    }

    @PostMapping
    public ResponseEntity<Pizza> create(@RequestBody Pizza pizza) {
        return ResponseEntity.ok(this.pizzaService.create(pizza));
    }

    @PutMapping("{id}")
    public ResponseEntity<Pizza> update( @PathVariable Integer id, @RequestBody Pizza pizza){
        return ResponseEntity.ok(this.pizzaService.update(id, pizza));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> remove(@PathVariable Integer id) {
        return ResponseEntity.ok(this.pizzaService.remove(id));
    }
}
