package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemoExample {

	public static void main(String[] args) {
		Map<Integer, String> countryCodesEU = new HashMap<>();
		 
		countryCodesEU.put(44, "United Kingdom");
		countryCodesEU.put(33, "France");
		countryCodesEU.put(49, "Germany");
		 
		Map<Integer, String> countryCodesWorld = new HashMap<>();
		 
		countryCodesWorld.put(1, "United States");
		countryCodesWorld.put(86, "China");
		countryCodesWorld.put(82, "South Korea");
		 		 
		System.out.println("Before: " + countryCodesWorld);
		 
		countryCodesWorld.putAll(countryCodesEU);
		 
		System.out.println("After: " + countryCodesWorld);

	}

}
