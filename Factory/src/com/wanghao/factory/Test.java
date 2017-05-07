package com.wanghao.factory;

import java.util.Scanner;

public class Test {
	/**
	 * ���Թ�������ģʽ
	 *1.����Ա���˿�Ҫ���µ��ײ�
	 *2.����Ա�Ѵ���õ��ײͶ˸��˿�
	 *3.�����µ�
	 * */
	public static void main(String[] args) {
		System.out.println("��ѡ���ײͣ�");
		System.out.println("�ײ�1��һ��������һ����֭");
		System.out.println("�ײ�2��һ����������һ������");
		
		//�Ƿ�����㵥
		boolean bo=true;
		do{
		//ѡ���ײ�
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
			System.out.println("���������������������룺");
			break;
		}
		
		System.out.println("�˸��˿͵��ײ��ǣ�");
		System.out.println(meal.getFood()+"��"+meal.getDrink());
		}while(bo);
	}
}
