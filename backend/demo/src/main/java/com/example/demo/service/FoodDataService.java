package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.repository.FoodDataRepository;
import com.example.demo.model.FoodData;

@Service
public class FoodDataService {

    @Autowired
    FoodDataRepository foodDataRepository;

    public FoodDataService() {
        super();

    }

    public List<FoodData> getFoodData() {
        return (List<FoodData>) foodDataRepository.findAll();
    }

    public void addFoodData(FoodData newFoodData) {
        foodDataRepository.save(newFoodData);
    }

    public Optional<FoodData> findByID(Long id) {
        return foodDataRepository.findById(id);
    }

}
