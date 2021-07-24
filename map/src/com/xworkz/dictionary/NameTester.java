package com.xworkz.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class NameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> nameAndFavouriteFoodMap = new HashMap<String, String>();
		nameAndFavouriteFoodMap.put("Sunita","chickenItems");
		nameAndFavouriteFoodMap.put("Ranjitha","Pongal");
		nameAndFavouriteFoodMap.put("Harshitha","chickenBiriyani");
		nameAndFavouriteFoodMap.put("Sunil","Palav");
		nameAndFavouriteFoodMap.put("Sachin","Mutton");
		nameAndFavouriteFoodMap.put("Mridula","Fish");
		
		System.out.println(nameAndFavouriteFoodMap.size());
		System.out.println(nameAndFavouriteFoodMap.containsKey("Sunita"));// containsKey
		System.out.println(nameAndFavouriteFoodMap.containsValue("Pongal"));// containsValue
		// nameAndFavouriteFoodMap.clear();
		nameAndFavouriteFoodMap.remove("Mridula");
		System.out.println(nameAndFavouriteFoodMap.size());// size
		Set<String> keySet = nameAndFavouriteFoodMap.keySet();


		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			String temp = nameAndFavouriteFoodMap.get(str);
			System.out.println(str + " " + temp);
		}
		Collection<String> comp = nameAndFavouriteFoodMap.values();
		Iterator<String> iterator = comp.iterator();
		while (iterator.hasNext()) {
			String temp = iterator.next();
			System.out.println(temp);
	}
}
		

}	

