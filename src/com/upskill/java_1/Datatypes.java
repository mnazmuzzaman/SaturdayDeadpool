package com.upskill.java_1;

public class Datatypes {

	public static void main(String[] args) {
  System.out.println("Hello world,this is Nazmul");
	
     int a = 5;
     int b = 10;
     
     int sum = a+b;
     System.out.println(sum);
     
     String city ="New York";
     
     System.out.println(city);
     
     package com.upskill.java_1;

     public class Variables {
     	
     	//Variables in Java
     	String country = "USA";						//Instance OR global variable - Variables declared in Class level, outside method
     	
     	static String name = "Rasel";				//Static variable - variables belong to class and don't required creating object

     	public static void main(String[] args) {
     		String city = "New York";				//Local variable - variables declared in methods 
     		
     		System.out.println(name);
     		
     		Variables obj = new Variables();		//Creating Object
     		System.out.println(obj.country);
     		
     		method2("Queens");
     	}
     	
     	public static void method2(String county){			//Method parameter - variables used as method parameter, pass value
     		String city = "Bloomfield";	
     		System.out.println(county);
     	}
     }
     boolean isGood=true;
     System.out.println(isGood);
	}     
}
