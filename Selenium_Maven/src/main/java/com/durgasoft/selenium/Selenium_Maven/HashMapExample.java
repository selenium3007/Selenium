package com.durgasoft.selenium.Selenium_Maven;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(100, "Mahesh");
		m.put(101, "Durga");
		m.put(103, "Sunny");
		m.put(102, "Bunny");
		System.out.println(m);
		System.out.println(m.put(100, "Suresh"));
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);

	}

}



