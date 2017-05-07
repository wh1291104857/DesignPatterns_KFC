package com.wanghao.meal;

import com.wanghao.drink.Drink;
import com.wanghao.food.Food;

public class Meal {
	//套餐包括主食和饮料
	private Food food;
	private Drink drink;
	
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public Drink getDrink() {
		return drink;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	
	
}
