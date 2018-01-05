package com.interview.program;

public class UpperFirstChar {

	public static void main(String[] args) {
		String name = "ashish sambhaji biradar";
		String[] strTemp = name.split("\\s");
		String str = "";
		
		System.out.println("Given String : " +name);
		for(int i=0;i<strTemp.length;i++){
			
			String temp = strTemp[i];
			temp = temp.substring(0, 1).toUpperCase() + temp.substring(1)+ " ";
			
			str = str + temp;
			System.out.println(temp);
		}
			
		System.out.println("Modified String : " +str);
	}

}
