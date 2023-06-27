package com.dev.pizza.persistence.repository;

import com.dev.pizza.persistence.entity.Pizza;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository extends ListCrudRepository<Pizza, Integer> {}
