package com.collection;

import java.util.ArrayList;

public class ArrayListForEach {
		 public static void main(String args[]){  
			 //List li = new ArrayList();
		//	 List<String> li = new List<String>();
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay"); 
		  al.add("Ravi"); 
		  al.add("Ravi"); 
		  al.add("Ajay"); 
		  al.add("Ravi");
		  
		  for(int i=0;i<al.size();i++){
			  System.out.println(al);
		  }
		  
		  
		  for(String obj:al)  
		    System.out.println(obj);  
		}
		 
}  
