package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
// import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "foodData")
@EntityListeners(AuditingEntityListener.class)
public class FoodData implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotEmpty(message = "Name may not be empty")
    @Column(unique = false)
    String food_name;

    @NotNull(message = "Name may not be empty")
    @Column(unique = false)
    double calories;

    @NotNull(message = "Name may not be empty")
    @Column(unique = false)
    double fat;

    @NotNull(message = "Name may not be empty")
    @Column(unique = false)
    double protein;

    @NotNull(message = "Name may not be empty")
    @Column(unique = false)
    double carbohydrates;

    @NotNull(message = "Name may not be empty")
    @Column(unique = false)
    double sugar;

    @NotNull(message = "Name may not be empty")
    @Column(unique = false)
    double sodium;

    @NotNull(message = "Name may not be empty")
    @Column(unique = false)
    double vitamin_a;

    @NotNull(message = "Name may not be empty")
    @Column(unique = false)
    double vitamin_c;

    @NotNull(message = "Name may not be empty")
    @Column(unique = false)
    double potassium;

    @NotNull(message = "Name may not be empty")
    @Column(unique = false)
    double iron;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    public FoodData(String food_name, double calories, double fat, double protein, double carbohydrates, double sugar,
            double sodium, double vitamin_a, double vitamin_c, double potassium, double iron) {
        super();
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

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public double getVitamin_a() {
        return vitamin_a;
    }

    public void setVitamin_a(double vitamin_a) {
        this.vitamin_a = vitamin_a;
    }

    public double getVitamin_c() {
        return vitamin_c;
    }

    public void setVitamin_c(double vitamin_c) {
        this.vitamin_c = vitamin_c;
    }

    public double getPotassium() {
        return potassium;
    }

    public void setPotassium(double potassium) {
        this.potassium = potassium;
    }

    public double getIron() {
        return iron;
    }

    public void setIron(double iron) {
        this.iron = iron;
    }

}
