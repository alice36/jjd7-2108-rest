package com.example.restaurant.controller;

import com.example.restaurant.model.Dish;
import com.example.restaurant.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dishes")
public class DishController {

    private DishRepository dishRepository;

    public DishController(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @GetMapping
    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dish> getDish(@PathVariable("id") int id) {
        if(id >= dishRepository.findAll().size())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(dishRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity saveDish(@RequestBody Dish dish) {
        dishRepository.save(dish);
        return ResponseEntity.ok().build();
    }
}
