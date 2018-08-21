package com.example.restaurant.repository;

import com.example.restaurant.model.Dish;
import com.example.restaurant.model.Ingredient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class DishRepository {

    private List<Dish> dishes;

    public DishRepository() {
        dishes = new ArrayList<>();
        Ingredient ing1 = new Ingredient("mąka", 150);
        Ingredient ing2 = new Ingredient("pomidory", 100);
        Ingredient ing3 = new Ingredient("pieczarki", 150);
        Ingredient ing4 = new Ingredient("ser", 200);
        Dish dish1 = new Dish("Pizza funghi", 25);
        dish1.setIngredients(Arrays.asList(ing1, ing2, ing3, ing4));
        dishes.add(dish1);

        Ingredient ing5 = new Ingredient("makaron", 150);
        Ingredient ing6 = new Ingredient("pomidory", 100);
        Ingredient ing7 = new Ingredient("mięso mielone", 150);
        Dish dish2 = new Dish("Spaghetti Bolognese", 32);
        dish2.setIngredients(Arrays.asList(ing5, ing6, ing7));
        dishes.add(dish2);
    }

    public List<Dish> findAll() {
        return dishes;
    }

    public Dish findById(int id) {
        return dishes.get(id);
    }

    public void save(Dish dish) {
        dishes.add(dish);
    }
}
