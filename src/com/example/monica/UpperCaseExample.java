package com.example.monica;

public class UpperCaseExample {

/*	public static void main(String[] args)
	{
		
		String str = "i love my india very much";
		
		String[] ar = str.split("\\s",4);
				
		String fstring = Character.toUpperCase(ar[0].charAt(0)) + ar[0].substring(1);
		String sstring = Character.toUpperCase(ar[1].charAt(0)) + ar[1].substring(1);
		String tstring = Character.toUpperCase(ar[2].charAt(0)) + ar[2].substring(1);
		String frstring = Character.toUpperCase(ar[3].charAt(0)) + ar[3].substring(1);
		
		System.out.println(fstring + " " + sstring + " " + tstring + " " +  frstring);
	}*/
	
	public static void main(String[] args)
	{
		String str = "i love my india";
		StringBuilder b = new StringBuilder();
		String[] ar = str.split("\\s");
		
		for(int i=0;i<ar.length;i++){
		//	System.out.println(ar.length);
			System.out.println(ar[i]);
			b.append(ar[i].substring(0, 1).toUpperCase() + ar[i].substring(1)+" ");
		}
		System.out.println("Modified string: " +b);
		
		
		/*
				
		String fstring = Character.toUpperCase(ar[0].charAt(0)) + ar[0].substring(1);
		String sstring = Character.toUpperCase(ar[1].charAt(0)) + ar[1].substring(1);
		String tstring = Character.toUpperCase(ar[2].charAt(0)) + ar[2].substring(1);
		String frstring = Character.toUpperCase(ar[3].charAt(0)) + ar[3].substring(1);
		
		System.out.println(fstring + " " + sstring + " " + tstring + " " +  frstring);*/
	}
	
}
