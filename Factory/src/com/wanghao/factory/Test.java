package com.wanghao.factory;

import java.util.Scanner;

public class Test {
	/**
	 * 测试工厂方法模式
	 *1.服务员按顾客要求下单套餐
	 *2.服务员把搭配好的套餐端给顾客
	 *3.继续下单
	 * */
	public static void main(String[] args) {
		System.out.println("请选择套餐：");
		System.out.println("套餐1：一个鸡肉卷和一杯橙汁");
		System.out.println("套餐2：一个汉堡包和一杯可乐");
		
		//是否继续点单
		boolean bo=true;
		do{
		//选择套餐
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		Meal meal=null;
		MealFactory mealFactory=null;
		
		if(num==1 || num==2){
			switch(num){
			case 1:
				mealFactory =new Meal1Factory();
				meal=mealFactory.createMeal();
				break;
			case 2:
				mealFactory =new Meal2Factory();
				meal=mealFactory.createMeal();
				break;
			}
		}else{
			System.out.println("您的输入有误，请重新输入：");
			break;
		}
		
		System.out.println("端给顾客的套餐是：");
		System.out.println(meal.getFood()+"和"+meal.getDrink());
		}while(bo);
	}
}
