package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Number> linkedNumbers = new LinkedList<Number>();
		 
		linkedNumbers.add(new Integer(123));
		linkedNumbers.add(new Float(3.1415));
		linkedNumbers.add(new Double(299.988));
		linkedNumbers.add(new Long(67000));
		
		Iterator<Number> itr = linkedNumbers.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
