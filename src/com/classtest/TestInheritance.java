package com.classtest;

interface color{
	void color();
}

interface leg{
	void leg();
}

class Animal {  
	void eat() throws ArithmeticException{
		System.out.println("eating...");
	}  
}

class Dog extends Animal{  
	final void bark(){
		System.out.println("barking...");
		throw new ArithmeticException();
	}  
}

class Cat extends Dog implements color,leg{  
	void meow(){
		System.out.println("meowing...");
	} 
	
	public void color(){
		System.out.println("color is black");
	}
	
	
	public void leg(){
		System.out.println("Legs are 4");
	}
}  

class TestInheritance{  
	public static void main(String args[]){  
		Cat c=new Cat();  
	//	Cat c = new Animal();
	//	Animal a = new Cat();
		c.meow();  
		try{
			c.bark();
		}catch(ArithmeticException e){
			System.out.println(e.toString());
		}
		c.eat();  
		c.bark();//C.T.Error
		
		c.color();
		c.leg();
	}
}  