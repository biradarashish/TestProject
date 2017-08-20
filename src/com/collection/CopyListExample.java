package com.collection;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class CopyListExample {

	public static void main(String[] args) {
		List<String> sourceList = new ArrayList<String>();
		sourceList.add("A");
		sourceList.add("B");
		sourceList.add("C");
		sourceList.add("D");
		 
		List<String> destList = new ArrayList<String>();
		destList.add("V");
		destList.add("W");
		destList.add("X");
		destList.add("Y");
		destList.add("Z");
		 
		System.out.println("destList before copy: " + destList);
		 
		Collections.copy(destList, sourceList);
		 
		System.out.println("destList after copy: " + destList);

	}

}
