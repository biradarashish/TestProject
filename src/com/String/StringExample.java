package com.String;

public class StringExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Test");
		sb.append(" Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java
		
		final int a = 10;
		System.out.println(a*a);
		
	}

}
