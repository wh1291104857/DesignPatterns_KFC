package com.wanghao.builder;

public abstract class MealBuilder {
	//定义套餐基类
	protected Meal meal=new Meal();
	
	public abstract void buildFood();
	public abstract void buildDrink();
	
	public Meal getMeal() {
		return meal;
	}
	
	
}
