package com.test;

public class Puppy {

	/*public Puppy(){
		System.out.println("Puppy default");
	}*/
	
	public Puppy(String sName){
		//this();
		System.out.println("Puppy name constructor");
	}
	
	public static void main(String args[]){
		Puppy p = new Puppy("Tommy");
	//	Puppy p1 = new Puppy();
	}
}
