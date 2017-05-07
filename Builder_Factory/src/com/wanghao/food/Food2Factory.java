package com.wanghao.food;

public class Food2Factory implements FoodFactory {

	public Food createFood() {
		return new Food2();
	}

}
