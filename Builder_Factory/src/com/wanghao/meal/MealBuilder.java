package com.wanghao.meal;

public abstract class MealBuilder {
	//�����ײͻ���
		protected Meal meal=new Meal();
		
		public abstract void buildFood();
		public abstract void buildDrink();
		
		public Meal getMeal() {
			return meal;
		}
}
