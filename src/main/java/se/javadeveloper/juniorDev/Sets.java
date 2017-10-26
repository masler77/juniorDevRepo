package se.javadeveloper.juniorDev;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// define collection
		
		Set<String> animals = new HashSet<String>();
		
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
		HashSet<String> farmanimals = new HashSet<String>();
		
		farmanimals.add("cow");
		farmanimals.add("chicken");
		farmanimals.add("cat");
		farmanimals.add("elefant");
		farmanimals.add("pigg");

		//interseption de som finns i båda seten
		
		Set<String> interseption = new HashSet<String>(animals);
		System.out.println("interseption: " + interseption);
		// ladda båda seten
		interseption.retainAll(farmanimals);
		
		System.out.println("both sets " +interseption);
		
		//slå ihop setten
		
		Set<String> unionSet = new HashSet<String>(farmanimals);
		unionSet.addAll(animals);
		
		System.out.println("animals" + unionSet);
		
		
		// element som anorlunda
		Set<String> diffrent = new HashSet<String>(farmanimals);
		diffrent.remove(farmanimals);
	}

}
