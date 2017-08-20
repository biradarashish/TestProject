package com.test;

import java.util.Scanner;

public class Employee {

	   // this instance variable is visible for any child class.
	   public String sName;

	   // salary  variable is visible in Employee class only.
	   private double dSalary;
	   
	   public static int iAge;

	   Employee () {
		   System.out.println("Inside default constructor");
		   
	   }
	   // The name variable is assigned in the constructor.
	   Employee (String sName) {
		  this();
		   System.out.println("Inside 1 paramter constructor");
		   this.sName = sName;
	   }
	   
	   public void sName(String name){
		   sName = name;
	   }
	   
	   // The salary variable is assigned a value.
	   public void setSalary(double empSal) {
	      dSalary = empSal;
	   }

	   // This method prints the employee details.
	   public void printEmp() {
		 //  sAge = 30;    static variable cannot be initialized in non static method
	      System.out.println("name  : " + sName );
	      System.out.println("salary :" + dSalary);
	      System.out.println("Age: " +iAge);
	   }

	   public static void main(String args[]) {
		   Scanner sc = new Scanner(System.in);
		   String sName = sc.next();
	      Employee empOne = new Employee(sName);
	    //  Employee empOne = new Employee();
	     
	      empOne.setSalary(1000);
	      iAge = 30;
	      empOne.printEmp();
	   }
	}