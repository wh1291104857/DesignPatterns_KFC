package com.wanghao.drink;

public class Drink1Factory implements DrinkFactory {

	public Drink createDrink() {
		return new Drink1();
	}
	

}
