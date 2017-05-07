package com.wanghao.meal;

public class KFCWaiter {
	private MealBuilder mealBuilder;
	
	//�ײ�������
	public void setMealBuilder(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}
	
	//����Ա�����ײ�
	public Meal construct(){
		mealBuilder.buildFood();
		mealBuilder.buildDrink();
		return mealBuilder.getMeal();
	}
	
}
