package com.example.restaurant.model;

public class Ingredient {
    private String name;
    private int grams;

    public Ingredient() {
    }

    public Ingredient(String name, int grams) {
        this.name = name;
        this.grams = grams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }
}
