package com.wanghao.meal;

import com.wanghao.drink.Drink1Factory;
import com.wanghao.drink.DrinkFactory;
import com.wanghao.food.Food1Factory;
import com.wanghao.food.FoodFactory;

public class Meal1builder extends MealBuilder {
	
	/*
	 * 套餐一：
	 * 一个鸡肉卷和一杯橙汁
	 * */
	
	public void buildFood()
	{
		FoodFactory foodFactory = new Food1Factory();
		meal.setFood(foodFactory.createFood());
	}
	public void buildDrink()
	{
		DrinkFactory drinkFactory = new Drink1Factory();
	    meal.setDrink(drinkFactory.createDrink());
	}

	
}
