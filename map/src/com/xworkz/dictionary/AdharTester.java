package com.xworkz.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class AdharTester {

	public static void main(String[] args) {
		Map<Long, Long> adharNoAndMobileNoMap = new HashMap<Long, Long>();
		adharNoAndMobileNoMap.put(988761234321l,8050811032l);
		adharNoAndMobileNoMap.put(123443211234l,9743992123l);
		adharNoAndMobileNoMap.put(98778900987l,8989767683l);
		adharNoAndMobileNoMap.put(56788765565l,9876876523l);
		adharNoAndMobileNoMap.put(545467674564l,6775432134l);
		adharNoAndMobileNoMap.put(987654321234l,9876543211l);
		
		System.out.println(adharNoAndMobileNoMap.size());
		System.out.println(adharNoAndMobileNoMap.containsKey(988761234321l));// containsKey
		System.out.println(adharNoAndMobileNoMap.containsValue(9743992123l));// containsValue
		// adharNoAndMobileNoMap.clear();
		adharNoAndMobileNoMap.remove("545467674564l");
		System.out.println(adharNoAndMobileNoMap.size());// size
		Set<Long> keySet = adharNoAndMobileNoMap.keySet();


		Iterator<Long> itr = keySet.iterator();
		while (itr.hasNext()) {
			Long lon = itr.next();
			Long temp = adharNoAndMobileNoMap.get(lon);
			System.out.println(lon + " " + temp);
	}
		Collection<Long> comp = adharNoAndMobileNoMap.values();
		Iterator<Long> iterator = comp.iterator();
		while (iterator.hasNext()) {
			Long temp = iterator.next();
			System.out.println(temp);
	}
}

	
}

