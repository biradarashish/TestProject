package com.exception;

import java.io.IOException;

public class ThrowAndThrowsExample {
	  
		  void m() throws IOException{  
		    throw new IOException("device error");//checked exception  
		  }  
		  
		  void n() throws IOException{  
		    m();  
		  }  
		  
		  void p(){  
		   try{  
		    n();  
		   }catch(IOException e){
			   System.out.println("IOException handled");}  
		  }  
		  
		 public static void main(String args[]){  
		   ThrowAndThrowsExample obj=new ThrowAndThrowsExample();  
		   obj.p();  
		   System.out.println("normal flow...");  
		}  
}  

