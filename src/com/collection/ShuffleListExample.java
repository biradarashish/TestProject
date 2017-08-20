package com.collection;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ShuffleListExample {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i <= 10; i++) 
			numbers.add(i);
		 
		System.out.println("List before shuffling: " + numbers);
		 
		Collections.shuffle(numbers);
		System.out.println("List after shuffling: " + numbers);

		Collections.reverse(numbers);
		System.out.println("List after reversing: " + numbers);
	}

}
