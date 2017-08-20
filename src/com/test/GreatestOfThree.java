package com.test;

public class GreatestOfThree {

	public static void main(String[] args) {
		int a, b,c;
		a=6;
		b=9;
		c=7;
		
		if(a>b && a>c){
			System.out.println("a is greater");
		}else if(b>a && b>c){
			System.out.println("b is greater");
		}else if(c>a && c>b){
			System.out.println("c is greater");
		}
		
	}

}
