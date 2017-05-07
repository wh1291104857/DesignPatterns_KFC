package com.wanghao.factory;

public class Meal1Factory implements MealFactory {

	@Override
	public Meal createMeal() {
		return new Meal1();
	}
	
}
