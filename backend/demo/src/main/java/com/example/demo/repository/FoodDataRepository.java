package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FoodData;
// import com.example.demo.service.FoodDataService;

@Repository
public interface FoodDataRepository extends CrudRepository<FoodData, Long> {
    // FoodData findByID(Long id);
}
