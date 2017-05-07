package com.wanghao.factory;

public class Meal2Factory implements MealFactory {

	@Override
	public Meal createMeal() {
		return new Meal2();
	}

}
