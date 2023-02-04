package com.upskill.java_2;

public class ifelasestatment {
	//conditional Statement
	public static void main(String[] args){
		int age=70;
		if (age<=13){
			System.out.println("you are children!");
		}else if (age>13&& age <18){
			System.out.println("you are teenger !");
		}else if (age>=60){
			if(age<100){
				System.out.println("you are champion !");
			}
			System.out.println("you are Senier !");
		
		}else{
			System.out.println("you are adult !");
		}
	}

}
