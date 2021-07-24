package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GovtTester {

	public static void main(String[] args) {
		Map<String, Double> govtOfficialAndSalary = new HashMap<String, Double>();
		govtOfficialAndSalary.put("IAS", 50.000d);
		govtOfficialAndSalary.put("MLA", 45000d);
		govtOfficialAndSalary.put("POLICE", 35000d);
		govtOfficialAndSalary.put("LINEMAN", 25000d);
		govtOfficialAndSalary.put("DOCTOR", 65000d);

		System.out.println(govtOfficialAndSalary.size());
		System.out.println(govtOfficialAndSalary.containsKey("LINEMAN"));// containsKey
		System.out.println(govtOfficialAndSalary.containsValue(65000d));// containsValue
		// govtOfficialAndSalary.clear();
		govtOfficialAndSalary.remove("MLA");
		System.out.println(govtOfficialAndSalary.size());// size
		Set<String> keySet = govtOfficialAndSalary.keySet();

		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			Double temp = govtOfficialAndSalary.get(str);
			System.out.println(str + " " + temp);
		}
		Collection<Double> comp = govtOfficialAndSalary.values();
		Iterator<Double> iterator = comp.iterator();
		while (iterator.hasNext()) {
			Double temp = iterator.next();
			System.out.println(temp);
		}
	}

}
