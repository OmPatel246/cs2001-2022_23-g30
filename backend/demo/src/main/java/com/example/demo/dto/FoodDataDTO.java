package com.example.demo.dto;

public class FoodDataDTO {

    String food_name;
    double calories;
    double fat;
    double protein;
    double carbohydrates;
    double sugar;
    double sodium;
    double vitamin_a;
    double vitamin_c;
    double potassium;
    double iron;

    public String getfood_name() {
        return food_name;
    }

    public void setfood_name(String food_name) {
        this.food_name = food_name;
    }

    public double getcalories() {
        return calories;
    }

    public void setcalories(double calories) {
        this.calories = calories;
    }

    public double getfat() {
        return fat;
    }

    public void setfat(double fat) {
        this.fat = fat;
    }

    public double getprotein() {
        return protein;
    }

    public void setprotein(double protein) {
        this.protein = protein;
    }

    public double getcarbohydrates() {
        return carbohydrates;
    }

    public void setcarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getsugar() {
        return sugar;
    }

    public void setsugar(double sugar) {
        this.sugar = sugar;
    }

    public double getsodium() {
        return sodium;
    }

    public void setsodium(double sodium) {
        this.sodium = sodium;
    }

    public double getvitamin_a() {
        return vitamin_a;
    }

    public void setvitamin_a(double vitamin_a) {
        this.vitamin_a = vitamin_a;
    }

    public double getvitamin_c() {
        return vitamin_c;
    }

    public void setvitamin_c(double vitamin_c) {
        this.vitamin_c = vitamin_c;
    }

    public double getpotassium() {
        return potassium;
    }

    public void setpotassium(double potassium) {
        this.potassium = potassium;
    }

    public double getiron() {
        return iron;
    }

    public void setiron(double iron) {
        this.iron = iron;
    }

    public FoodDataDTO(String food_name, double calories, double fat, double protein, double carbohydrates,
            double sugar, double sodium, double vitamin_a, double vitamin_c, double potassium, double iron) {
        this.food_name = food_name;
        this.calories = calories;
        this.fat = fat;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.sugar = sugar;
        this.sodium = sodium;
        this.vitamin_a = vitamin_a;
        this.vitamin_c = vitamin_c;
        this.potassium = potassium;
        this.iron = iron;
    }

}
