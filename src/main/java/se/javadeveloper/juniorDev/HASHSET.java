package se.javadeveloper.juniorDev;

import java.util.HashSet;

public class HASHSET {

	public static void main(String[] args) {
		// define collection
		
		HashSet<String> animals = new HashSet<String>();
		
		// 2. add animals.
		
		animals.add("hund");
		animals.add("ekorre");
		animals.add("orm");

		animals.add("cat");
		animals.add("delfin");
		animals.add("fågel");
		
		System.out.println(animals.size()+" "+animals);
		
		animals.add("elefant");
		animals.add("delfin");
		animals.add("örn");
		
		System.out.println(animals.size()+" "+animals);
		
		//new set
		
	}

}
