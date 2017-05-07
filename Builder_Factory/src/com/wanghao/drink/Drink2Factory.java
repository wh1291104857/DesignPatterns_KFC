package com.wanghao.drink;

public class Drink2Factory implements DrinkFactory {

	public Drink createDrink() {
		return new Drink2();
	}

}
