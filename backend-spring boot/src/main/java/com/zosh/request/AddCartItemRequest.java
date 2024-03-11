package com.zosh.request;

import java.util.List;

import com.zosh.model.Food;

import lombok.Data;

@Data
public class AddCartItemRequest {
	
	private Long menuItemId;
	private int quantity;
	private List<String> ingredients;
	public Long getMenuItemId() {
		return menuItemId;
	}
	public void setMenuItemId(Long menuItemId) {
		this.menuItemId = menuItemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	public AddCartItemRequest() {
		super();
	}
	public AddCartItemRequest(Long menuItemId, int quantity, List<String> ingredients) {
		super();
		this.menuItemId = menuItemId;
		this.quantity = quantity;
		this.ingredients = ingredients;
	}
	

}
