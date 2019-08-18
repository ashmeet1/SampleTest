package com.hashMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class NestedHashMapTest {
	public static void main(String[] args) {
		// Arraylist of MH cities
		ArrayList<String> cityMH = new ArrayList<>();
		cityMH.add("Mumbai");
		cityMH.add("Nagpur");
		cityMH.add("Pune");
		System.out.println(cityMH);
		
		// Arraylist of MP cities
		ArrayList<String> cityMP = new ArrayList<>();
		cityMP.add("Bhopal");
		cityMP.add("Ujain");
		cityMP.add("Indore");
		System.out.println(cityMP);
		
		// Arraylist of DL cities
		ArrayList<String> cityDL = new ArrayList<>();
		System.out.println(cityDL);
		
		// HashMap State: All cities added in to state
		HashMap<String, ArrayList<String>> State = new HashMap<>();
		State.put("Maharashtra", cityMH);
		State.put("Madhyapradesh", cityMP);
		State.put("Delhi", cityDL);
		System.out.println(State);
		
		// HashMap Country : All state added in to country
		HashMap<String, HashMap<String, ArrayList<String>>> country = new HashMap<>();
		country.put("India", State);

		// for iterating map
		Set<Entry<String, HashMap<String, ArrayList<String>>>> entry = country.entrySet();

		// for each loop for printing data
		for (Entry<String, HashMap<String, ArrayList<String>>> str : entry) {
			System.out.println(str.getKey() + str.getValue());
		}

	}

}
