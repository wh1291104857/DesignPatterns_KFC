package com.wanghao.food;

public class Food1Factory implements FoodFactory {

	public Food createFood() {
		return new Food1();
	}

}
