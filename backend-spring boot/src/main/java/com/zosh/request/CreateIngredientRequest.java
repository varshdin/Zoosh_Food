package com.zosh.request;

import lombok.Data;

@Data
public class CreateIngredientRequest {

    private Long restaurantId;
    private String name;
    private Long ingredientCategoryId;
	public Long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getIngredientCategoryId() {
		return ingredientCategoryId;
	}
	public void setIngredientCategoryId(Long ingredientCategoryId) {
		this.ingredientCategoryId = ingredientCategoryId;
	}
	public CreateIngredientRequest(Long restaurantId, String name, Long ingredientCategoryId) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.ingredientCategoryId = ingredientCategoryId;
	}
	public CreateIngredientRequest() {
		super();
	}
    
}
