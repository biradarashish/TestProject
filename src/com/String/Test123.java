package com.String;

public class Test123 {
	public static void main(String args[]){
		String s = "test phase - 06/07/2017 Standard Visit AU0007864";
		String ar[] = s.split("Standard Visit");
		
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
		
		String s1 = "test phase - 06/07/2017 Action Plan : 07/06/2017 AU0007864";
		String ar1[] = s1.split("Action Plan :");
		
		for(int i=0;i<ar1.length;i++){
			System.out.println(ar1[i]);
		}
	}
}
