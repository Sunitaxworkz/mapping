package com.xworkz.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.Iterator;

public class FishTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FishDTO dto = new FishDTO("Siamese Fighting Fish", "Green", "Aquarium", 2, 500, "male");
		FishDTO dto1 = new FishDTO("Common Carp", "Gray", "Cyprinus", 47, 350, "Female");
		FishDTO dto2 = new FishDTO("Goldfish", "Gold", "Aquarium", 30, 1000, "Female");
		FishDTO dto3 = new FishDTO("Zander", "Gray", "Sand", 30, 1000, "male");

		List<FishDTO> collection = new ArrayList<FishDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);

		Comparator<FishDTO> fishName = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(collection, fishName);
		Iterator<FishDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			FishDTO fishDetails = (FishDTO) itr.next();
			System.out.println("name " + fishDetails.getName());
		}
		Comparator<FishDTO> fishColor = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO f1, FishDTO f2) {
				return f1.getColor().compareTo(f2.getColor());
			}
		};

		Collections.sort(collection, fishColor);
		Iterator<FishDTO> itr1 = collection.iterator();
		while (itr1.hasNext()) {
			FishDTO fishDetails = (FishDTO) itr1.next();
			System.out.println("color " + fishDetails.getColor());
		}
		Comparator<FishDTO> fishNameDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO f1, FishDTO o2) {
				return o2.getName().compareTo(f1.getName());
			}
		};

		Collections.sort(collection, fishNameDesc);
		Iterator<FishDTO> itr2 = collection.iterator();
		while (itr2.hasNext()) {
			FishDTO fishDetails = (FishDTO) itr2.next();
			System.out.println("name in desc  " + fishDetails.getName());
		}
		Comparator<FishDTO> fishLifeSpan = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO f1, FishDTO f2) {
				if (f1.getLifeSpan() == f2.getLifeSpan())
					return 0;
				else if (f1.getLifeSpan() > f2.getLifeSpan())
					return 1;
				else
					return -1;
			}

		};
		Collections.sort(collection, fishLifeSpan);

		Iterator<FishDTO> itr3 = collection.iterator();
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			FishDTO fishDTO = (FishDTO) iterator.next();
			System.out.println("LifeSpan : " + fishDTO.getLifeSpan());

		}
		Comparator<FishDTO> lifeSpanDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO f1, FishDTO f2) {
				if (f2.getLifeSpan() == f1.getLifeSpan())
					return 0;
				else if (f2.getLifeSpan() > f1.getLifeSpan())
					return -1;
				else

					return 1;
			}
		};
		Collections.sort(collection, lifeSpanDesc.reversed());

		Iterator itr4 = collection.iterator();
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			FishDTO fishDTO = (FishDTO) iterator.next();
			System.out.println("Life Span Desc : " + fishDTO.getLifeSpan());

		}

		Comparator<FishDTO> fishcostDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO f1, FishDTO f2) {
				if (f2.getCost() == f1.getCost())
					return 0;
				else if (f2.getCost() > f1.getCost())
					return -1;
				else
					return 1;
			}

		};
		Collections.sort(collection, fishcostDesc.reversed());

		Iterator itr5 = collection.iterator();
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			FishDTO fishDTO = (FishDTO) iterator.next();
			System.out.println("FishCost Desc : " + fishDTO.getCost());
		}

	}

}
