package com.dev.pizza.service;

import com.dev.pizza.persistence.entity.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PizzaService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Pizza> FindAll() {
        return this.jdbcTemplate.query("SELECT * FROM public.pizzas", new BeanPropertyRowMapper<>(Pizza.class));
    }
}
