package com.durgasoft.selenium.Selenium_Maven;

import java.util.Map;
import java.util.TreeMap;

public class ExampleHashMap {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		map.put(1, 100);
		map.put(30, 300);
		map.put(20, 200);
		map.put(4, 400);
		System.out.println(map);

	}

}
