package com.interview.program;

public class Swap2Numbers {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		System.out.println("values before swap: a = " +a+ " and b = " +b );
		
		a = a+b; 	//20+10 = 30
		b = a-b;	//30-10 = 20
		a = a-b;	//30-20 = 10
		
		System.out.println("values after swap: a = " +a+ " and b = " +b );
	}

}
