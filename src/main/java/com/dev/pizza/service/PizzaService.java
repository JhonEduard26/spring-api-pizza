package com.dev.pizza.service;

import com.dev.pizza.persistence.entity.Pizza;
import com.dev.pizza.persistence.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Pizza create(Pizza pizza) {
        return this.pizzaRepository.save(pizza);
    }

    public Pizza update(Integer id, Pizza pizza) {
        Pizza pizzaFound = this.findOneById(id);

        if (pizzaFound == null) {
            return null;
        } else {
            return this.create(pizza);
        }
    }

    public String remove(Integer id) {
        Pizza pizzaFound = this.findOneById(id);

        if (pizzaFound == null) {
            return null;
        } else {
            this.pizzaRepository.deleteById(id);
            return "Pizza deleted successfully";
        }
    }
}
