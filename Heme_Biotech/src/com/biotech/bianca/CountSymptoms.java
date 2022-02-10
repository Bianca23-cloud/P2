package com.biotech.bianca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class CountSymptoms {
	

	public Map<String,Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer>map = new TreeMap<>();
	
		int count;
		
		
		for (String symptom : symptoms) {
		
			if (symptom != null) {
				if(!map.containsKey(symptom)) {
					map.put((String) symptom, 1);
				} else {
					map.put(symptom,  map.get(symptom)+1);
				}
		     }
		}
		return map;
	}
}
