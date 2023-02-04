package com.upskill.java_3;


//Polymorhism

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  car(6,"single");
  //car(1000);
  //car("Moon");
 // car("battery");
  
	}



public static void car(){
	System.out.println("My car is Audi");
}
 public static void car(int hp){
	 System.out.println("My car is Hummer !" + "it has hp engine:" +hp);
 }
  public static void car( String roof){
	 System.out.println("My car is BMW  !"  +  "it has roof:"  +roof);
 
}
  public static void car (int battery, String motor){
	  System.out.println("My car is Tesla ! "  + "it has battery:"  + battery + "it has Motor:" + motor);
  }
 }