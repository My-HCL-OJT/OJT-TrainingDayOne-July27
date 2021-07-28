package com.hcl.ojttraining_dayone_julytwse.dayonetopic.learn;

import java.util.HashSet;

public class LearnHashSet {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars);
		System.out.println(cars.contains("Mazda"));
		for (String i : cars) {
			  System.out.println(i);
			}
	}
}
