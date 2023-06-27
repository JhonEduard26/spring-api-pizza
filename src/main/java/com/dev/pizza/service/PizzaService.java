package com.dev.pizza.service;

import com.dev.pizza.persistence.entity.Pizza;
import com.dev.pizza.persistence.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {
     private final PizzaRepository pizzaRepository;

    @Autowired
    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<Pizza> findAll() {
        return this.pizzaRepository.findAll();
    }

    public Pizza findOneById(Integer id) {
        return this.pizzaRepository.findById(id).orElse(null);
    }
}
