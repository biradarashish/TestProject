package com.exception;

/*class Exception2 extends Exception1{
		 public void add(){
			 throws ArithmeticException;
		 }
}*/

public class Exception1 {  
	  public static void main(String args[]){  
	   try{  
	      int data=50/0;  
	   }catch(ArithmeticException e){
		   System.out.println(e);
	   } catch(Exception e){
		   
	   }finally{
		   System.out.println("hello");
	   }
	   System.out.println("rest of the code...");  
	}  
}  