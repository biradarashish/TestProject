package com.abst;

abstract class Bike{  
	Bike()
	{
		System.out.println("bike is created");
	}
	
	abstract void run();  
	
	void changeGear()
	{
		System.out.println("gear changed");
	}  
}  
	 
class Honda extends Bike
{  
	 void run()
	 {
		 System.out.println("running safely with Honda..");
	 }  
}  

class TestAbstraction2
{  
	 public static void main(String args[]){  
		 Bike obj = new Honda();
		// Bike bike = new Bike(); This type of object creation is not allowed is Java
		 obj.run();  
		 obj.changeGear();  
	 }  
}  