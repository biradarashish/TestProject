package com.interview.program;

public class ReverseString {

	public static void main(String[] args) {
		String input = "This is Ashish Biradar";
		char[] ar = input.toCharArray();
		
		for(int i=ar.length-1;i>=0;i--){
			System.out.print(ar[i]);
		}

	}

}
