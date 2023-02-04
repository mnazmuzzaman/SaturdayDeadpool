package com.upskill.java_6;

public class Singleton {
//singleton is class that can have only one object
	//Private constructor, it prevents any other class from instantiatings
	private Singleton(){
}
	
	
private static  Singleton SingletonObj=new Singleton ();

public static Singleton getInstance(){
	
	return SingletonObj;
}

protected static void demo(){
	System.out.println("Singleton Demo Method");
}
	
}


