package com.java8;

interface Shape
{
	void show();
}

class Circle implements Shape
{
	public void show(){
		System.out.println("Shape of circle is round");
	}
}

public class InterfaceExampleJava8 {
	public static void main(String args[]){
		Circle c = new Circle();
		c.show();
	}
}
