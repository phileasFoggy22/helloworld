package main;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello world to the standard out");

		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", new Integer(100));
		hm.put("b", new Integer(200));
		hm.put("c", new Integer(300));
		hm.put("d", new Integer(400));

		for (String value : hm.keySet()) {
			System.out.println("The value is " + value);
		}

	}

}
