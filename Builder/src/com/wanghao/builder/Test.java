package com.wanghao.builder;

import java.util.Scanner;

public class Test {
	/*
	 *测试建造者模式
	 *1.服务员按顾客要求下单套餐
	 *2.服务员把搭配好的套餐端给顾客
	 *3.继续下单
	 * */
	public static void main(String[] args) {
		System.out.println("请选择套餐：");
		System.out.println("套餐1：一个鸡肉卷和一杯橙汁");
		System.out.println("套餐2：一个汉堡包和一杯可乐");
		
		boolean bo=true;
		do{
		//选择套餐
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		KFCWaiter kfcWaiter=new KFCWaiter();
		MealBuilder mealBuilder=null;
		
		switch(num){
		case 1:
			mealBuilder=new Meal1builder();
			break;
		case 2:
			mealBuilder=new Meal2builder();
			break;
		default:
			System.out.println("您的输入有误，请重新输入：");
			break;
		}
		
		kfcWaiter.setMealBuilder(mealBuilder);
		Meal meal=kfcWaiter.construct();
		
		System.out.println("端给顾客的套餐是：");
		System.out.println(meal.getFood()+"和"+meal.getDrink());
		}while(bo);
	}
}
