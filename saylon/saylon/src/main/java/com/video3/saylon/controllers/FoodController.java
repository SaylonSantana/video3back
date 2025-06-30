package com.video3.saylon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.video3.saylon.dto.FoodRequestDTO;
import com.video3.saylon.dto.FoodResponseDTO;
import com.video3.saylon.entity.Food;
import com.video3.saylon.repository.FoodRepository;

@RestController
@RequestMapping("food")
public class FoodController {

	@Autowired
	private FoodRepository repository;
 
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    
	  @PostMapping
	    public void saveFood(@RequestBody FoodRequestDTO data){
	        Food foodData = new Food(data);
	        repository.save(foodData);
	        return;
	    }
 
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    
	 @GetMapping
	    public List<FoodResponseDTO> getAll(){

	        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
	        return foodList;
	    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        repository.deleteById(id);
    }
    


}
