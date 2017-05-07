package com.wanghao.meal;

import com.wanghao.drink.Drink2Factory;
import com.wanghao.drink.DrinkFactory;
import com.wanghao.food.Food2Factory;
import com.wanghao.food.FoodFactory;

public class Meal2builder extends MealBuilder {
	
	/*
	 * �ײͶ���
	 * һ����������һ������
	 * */
	
	@Override
	public void buildFood() {
		FoodFactory foodFactory = new Food2Factory();
		meal.setFood(foodFactory.createFood());	
		
	}

	@Override
	public void buildDrink() {
		DrinkFactory drinkFactory = new Drink2Factory();
	    meal.setDrink(drinkFactory.createDrink());
		
	}
	
	
}
