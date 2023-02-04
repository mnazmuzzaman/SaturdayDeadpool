package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmp_Hashset_Hashsetable {

	public static void main(String[]args){
	//Array store multipledata index	
		
		int age=30;  //Veritable
		
		int[]ageDeadpool = new int[]{25,21,35,30,40};  //Array
		
		//Array index [0] [1] [2] [3] [4]
		
		
		System.out.println("student Age:"+ageDeadpool[0]);
		
		System.out.println("Total Student:"  +ageDeadpool.length);
		
		
		String[]nameDeadpool = new String[]{"Nazmul","Masud","Zaman","Tahin"};
		
		System.out.println("Student Name:" + nameDeadpool[1]);
		System.out.println("Total Student:"  +nameDeadpool.length);
	
		
		
		
		// NameCity
        String[]NameCity = new String[]{"Newyork","Dhaka","Sylet","Queens"};
		
		System.out.println("City Name:" + NameCity[3]);
		System.out.println("Total City:"  +NameCity.length);
		
		
		
		//Multi-Dimentional Array
		
		int[][] ageUpskill2D = {{25,21,35,30,40},       //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
		                      {21,25,22,26}};           //[1][0] [1][1] [1][2] [1][3] [1][4] [1][5]
		
		
		                      System.out.println("Student Age 2D:" + ageUpskill2D[1][2]);
		                      
		                      
		                      
		 //Hasmap store multipul data using key-value pair,Implemention of Map interface
		                      
		HashMap<String,Integer>Student =new  HashMap<String,Integer>();
		Student.put("Tanzu", 22);
		Student.put("Tahin", 21);
		Student.put("Masud", 24);
		Student.put("Talha", 17);
		Student.put("Zaman",30);
		System.out.println("HasMap Student Age:" +Student.get("Tahin"));
		
		//HashMap for Capital for String
		HashMap<String,String>Capital =new  HashMap<String,String>();
		Capital.put("New York", "Albany");
		Capital.put("BD","Dhaka");
		Capital.put("USA","WDC");

	
		System.out.println("HasMap Capital:" +Capital.get("USA"));
		
		//Hashset 
		
		
		HashSet<String>Car =new  HashSet<String>();
		Car.add("BMW");
		Car.add("Toyota");
		Car.add("Audi");


		System.out.println(" Car: "+Car);
		
		
	    HashSet<String>Capital2 =new  HashSet<String>();
		Capital2.add( "Albany");
		Capital2.add("Dhaka");
		Capital2.add("WDC");

	
		System.out.println("HasSet Capital:" +Capital);
		
		
		
		
		//Hashtable
		
		
		Hashtable<String,String>Region =new  Hashtable<String,String>();
		Region.put("New York", "Albany");
		Region.put("BD","Dhaka");
		Region.put("USA","WDC");

	
		System.out.println("Region:" + Region.get("USA"));
		
		
		
		
		
		
		
		
		
		
	}
}