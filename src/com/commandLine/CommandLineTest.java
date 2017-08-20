package com.commandLine;

import java.util.Scanner;

public class CommandLineTest {

	public static void main (String[] args)
	  {
	    // create a scanner so we can read the command-line input
	    Scanner scanner = new Scanner(System.in);

	    //  prompt for the user's name
	    System.out.print("Enter your name: ");

	    // get their input as a String
	    String username = scanner.next();


	    System.out.println(String.format("%s", username));

	  }
	
}
