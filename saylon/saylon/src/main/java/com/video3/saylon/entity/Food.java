package com.video3.saylon.entity;

import com.video3.saylon.dto.FoodRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;  
	private String image;  
	private Integer price;  

	//  Construtor que recebe DTO
	public Food(FoodRequestDTO data){
	    this.image = data.image();
	    this.price = data.price();
	    this.title = data.title();
	}

	//  Construtor padrão (mesmo já tendo o @NoArgsConstructor)
	public Food() {
	}

	// Getters e Setters (opcional, já tem @Getter do Lombok)
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public String getImage() { return image; }
	public void setImage(String image) { this.image = image; }
	public Integer getPrice() { return price; }
	public void setPrice(Integer price) { this.price = price; }
}
