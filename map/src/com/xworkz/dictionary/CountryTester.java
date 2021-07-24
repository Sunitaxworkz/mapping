package com.xworkz.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class CountryTester {

	public static void main(String[] args) {
		Map<String, Double> nameAndPopulationMap = new HashMap<String, Double>();
		nameAndPopulationMap.put("India", 136.0d);// put
		nameAndPopulationMap.put("Nepal", 2.18d);
		nameAndPopulationMap.put("Bangladesh", 16.3d);
		nameAndPopulationMap.put("Shrilankha", 2.18d);
		nameAndPopulationMap.put("China", 139.77d);

		System.out.println(nameAndPopulationMap.size());// to find the size

		System.out.println(nameAndPopulationMap.containsKey("Rashya"));// containsKey
		System.out.println(nameAndPopulationMap.containsValue(136.0d));// containsValue
		// nameAndPopulationMap.clear();
		nameAndPopulationMap.remove("Bangladesh");
		System.out.println(nameAndPopulationMap.size());// size
		Set<String> keySet = nameAndPopulationMap.keySet();

		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			Double value = nameAndPopulationMap.get(str);
			System.out.println(str + " " + value);
		}
		Collection<Double> comp = nameAndPopulationMap.values();
		Iterator<Double> iterator = comp.iterator();
		while (iterator.hasNext()) {
			Double temp = iterator.next();
			System.out.println(temp);

		}

	}

}
