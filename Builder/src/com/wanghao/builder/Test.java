package com.wanghao.builder;

import java.util.Scanner;

public class Test {
	/*
	 *���Խ�����ģʽ
	 *1.����Ա���˿�Ҫ���µ��ײ�
	 *2.����Ա�Ѵ���õ��ײͶ˸��˿�
	 *3.�����µ�
	 * */
	public static void main(String[] args) {
		System.out.println("��ѡ���ײͣ�");
		System.out.println("�ײ�1��һ��������һ����֭");
		System.out.println("�ײ�2��һ����������һ������");
		
		boolean bo=true;
		do{
		//ѡ���ײ�
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
			System.out.println("���������������������룺");
			break;
		}
		
		kfcWaiter.setMealBuilder(mealBuilder);
		Meal meal=kfcWaiter.construct();
		
		System.out.println("�˸��˿͵��ײ��ǣ�");
		System.out.println(meal.getFood()+"��"+meal.getDrink());
		}while(bo);
	}
}
