package com.abst;

abstract class Shape{  
	abstract void draw();  
	
	void test()
	{
		System.out.println("TESTT");
	}
}  
  
class Rectangle extends Shape{  
	void draw()
	{
		System.out.println("drawing rectangle");
	}  
}  

class Circle1 extends Shape{  
	void draw()
	{
		System.out.println("drawing circle");
	}  
}  
  
class TestAbstraction1{  
	public static void main(String args[]){  
		Shape s=new Circle1();  
		s.draw();  
		Shape s1 = new Rectangle();
		s1.draw();
	}  
}  