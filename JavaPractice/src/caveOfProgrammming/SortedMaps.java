package caveOfProgrammming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hashMap= new HashMap<Integer,String>();
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer,String> treeMap=new TreeMap<Integer, String>();
		testMap(hashMap);
		testMap(linkedHashMap);
		testMap(treeMap);
		
	}
	
	public static void testMap(Map<Integer,String> map) {
		map.put(12, "Dog");
		map.put(1, "Fox");
		map.put(7, "Rat");
		map.put(4, "Cat");
		map.put(15, "Crow");
		map.put(9, "Eagle");
		
		for (Integer key:map.keySet()) {
			String value=map.get(key);
			System.out.println(key +": " +value);
		}
	}

}
