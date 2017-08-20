package com.loop;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String args[]) {
	      // char grade = args[0].charAt(0);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input String in name format... like Ashish or Kazi Or Chandan");
	      String input = sc.nextLine();

	      switch(input) {
	      case "Ashish" :
	    	  System.out.println("Input name : " +input);
	    	  break;
	      case "Kazi" :
	    	  System.out.println("Input name: " +input);
	    	  break;
	      case "Chandan" :
	    	  System.out.println("Input name: " +input);
	    	  break;  
	      }
	       /*  case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }*/
//	      System.out.println("Your grade is " + grade);
	   }
	
}
