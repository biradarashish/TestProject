package com.classtest;

import java.util.Scanner;

public class ClassTestExample {

	public static void main(String[] args) {
		int parmeter1,parmeter2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		parmeter1 = sc.nextInt();
		
		System.out.println("Enter value of b: ");
		parmeter2 = sc.nextInt();
		
		SumTest sum = new SumTest(parmeter1,parmeter2);
		System.out.println("Sum of two number: " +sum.getSum());
		System.out.println("Subtraction of two number: " +sum.getSubtract());

	}

}
