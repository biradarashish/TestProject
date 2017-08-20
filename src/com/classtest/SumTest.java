package com.classtest;

public class SumTest {
	private int parmeter1;
	private int parmeter2;
	private int total;
	
	//parameterised constructor
	public SumTest(int parmeter1, int parmeter2){
		this.parmeter1 = parmeter1; 
		this.parmeter2 = parmeter2;
	}
	
	//getSum method return value
	public int getSum(){
		total = parmeter1+parmeter2;
		return total;
	}
	
	public int getSubtract(){
		total = parmeter1-parmeter2;
		return total;
	}
}
