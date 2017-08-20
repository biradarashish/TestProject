package com.example.monica;

public class Alphabets {

	public static void main(String[] args) {
		String str1 = "i l0ve my w0rk 100 percent ";
		int countAlpha = 0; 
		int countSpace = 0;
		int countDigit = 0;
		for(int i = 0;i<str1.length();i++)
		{
			if(Character.isAlphabetic(str1.charAt(i)))
			{
				countAlpha++;
			}
			if(Character.isSpaceChar(str1.charAt(i)))
			{
				countSpace++;
			}
			if(Character.isDigit(str1.charAt(i))){
				countDigit++;
			}
		}
		System.out.println("Number of Alphabets in given string: "+countAlpha);
		System.out.println("Number of Spaces in given string: "+countSpace);
		System.out.println("Number of Digit in given String: " +countDigit);
	}
}
