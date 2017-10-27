package se.javadeveloper.juniorDev;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		//implementation av maps
		
		Map<Integer, String> Maptest = new LinkedHashMap<Integer, String>();
		
		Maptest.put(1, "test");
		mapUtil(Maptest);
		
		
		
		
	}

	private static void mapUtil(Map<Integer, String> maptest) {
		// an
		maptest.put(1, "Jenny");
		maptest.put(2, "Joakim");
		maptest.put(3, "Emilia");
		maptest.put(11, "fellman");
		maptest.put(12, "Simon");
		maptest.put(33445, "MagnusLarry");
		maptest.put(13, "Daniel");
		
		//access all element from map
		
		System.out.println("alla element från Map"+ maptest.keySet());
		System.out.println("....................................................");
		System.out.println("visa alla nyckelpar" + maptest);
		System.out.println("....................................................");
		System.out.println("alla element från Map"+ maptest.values());
	
		// foreach 
		// om det är en integer med settsen <IPnteger, String> Så ska det vara Keyset()
		
		for( int key : maptest.keySet()){
//			System.out.println("values" + key);
			System.out.println("....................................................");
			System.out.println("[KEY : "+key +". Value "+ maptest.get(key)+" ]");
		}
		
		
		
	
		
		
	}

}
