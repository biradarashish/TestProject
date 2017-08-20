package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> mapHttpErrors = new HashMap<>();
		 
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		 
		System.out.println(mapHttpErrors);
		
		String status200 = mapHttpErrors.get(200);
		System.out.println("200: " + status200);

	/*	SortedMap<String, String> mapDomains = new TreeMap<>();
		 
		mapDomains.put(".com", "International");
		mapDomains.put(".us", "United States");
		mapDomains.put(".uk", "United Kingdom");
		mapDomains.put(".jp", "Japan");
		mapDomains.put(".au", "Australia");
		 
		System.out.println(mapDomains);*/
	}

}
