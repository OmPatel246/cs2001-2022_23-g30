package com.example.demo.controller;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FoodDataDTO;
import com.example.demo.model.FoodData;
import com.example.demo.service.FoodDataService;

@RestController
public class FoodDataController {

    @Autowired
    FoodDataService foodDataService;

    // @GetMapping("/GET")
    // public List<FoodData> getFoodData() {
    // return foodDataService.getFoodData();
    // }

    @PostMapping("/formsubmit")
    public ResponseEntity<Optional<FoodData>> addFoodData(@RequestBody FoodDataDTO newFoodDataDTO) {

        FoodData newFoodData = new FoodData(
                newFoodDataDTO.getfood_name(),
                newFoodDataDTO.getcalories(),
                newFoodDataDTO.getfat(),
                newFoodDataDTO.getprotein(),
                newFoodDataDTO.getcarbohydrates(),
                newFoodDataDTO.getsugar(),
                newFoodDataDTO.getsodium(),
                newFoodDataDTO.getvitamin_a(),
                newFoodDataDTO.getvitamin_c(),
                newFoodDataDTO.getpotassium(),
                newFoodDataDTO.getiron());
        foodDataService.addFoodData(newFoodData);
        return new ResponseEntity<>(Optional.ofNullable(newFoodData), HttpStatus.CREATED);

    }
}
