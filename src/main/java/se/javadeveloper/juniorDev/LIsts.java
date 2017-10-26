package se.javadeveloper.juniorDev;

import java.util.ArrayList;

public class LIsts {

	public static void main(String[] args) {
		//1. skapa arrayList.
		ArrayList<String> cities = new ArrayList<String>();
		
		//2. add some elements
		
		cities.add("Nyköping");
		cities.add("Nyköping2");
		cities.add("Nyköping3");
		cities.add("Nyköping4");
		cities.add("Nyköping5");
		cities.add("Nyköping6");
		
		// iterate genom collageon
		for(String city : cities){
		System.out.println(city);
		}
		// 4. get size
		int size = cities.size();
		System.out.println(size);
		
		// index 
		System.out.println(cities.get(2));
		
		cities.remove(0);
		size = cities.size();
		System.out.println("nya storleken" + size);
		for(String city : cities){
		System.out.println(city);
		
		}
	}

}
