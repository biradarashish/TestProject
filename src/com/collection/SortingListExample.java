package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SortingListExample {

	public static void main(String[] args) {
		List<String> listStrings = new ArrayList<String>();
		
		listStrings.add("D");
		listStrings.add("C");
		listStrings.add("E");
		listStrings.add("A");
		listStrings.add("B");
		 
		System.out.println("listStrings before sorting: " + listStrings);
		Collections.sort(listStrings);
				 
		System.out.println("listStrings after sorting: " + listStrings);

	}
}
