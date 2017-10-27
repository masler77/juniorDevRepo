package se.javadeveloper.juniorDev;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSets {

	public static void main(String[] args) {
		
		//LinkedHash kommer att i ordning efer att det blivit tillagda
		// HasSet är helt osorterat
		//TreeHashSet är alfabetisk ordning
		// define collection
		
		Set<String> animals = new TreeSet<String>();
		
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

		//interseption de som finns i båda seten   Lika med  "AND" 
		
		Set<String> interseption = new HashSet<String>(animals);
		System.out.println("interseption: " + interseption);
		// ladda båda seten
		interseption.retainAll(farmanimals);
		
		System.out.println("both sets " +interseption);
		
		//slå ihop setten Lika med "OR"
		
		Set<String> unionSet = new HashSet<String>(farmanimals);
		unionSet.addAll(animals);
		
		System.out.println("animals" + unionSet);
		
		
		// element som anorlunda "i en men inte i den andra"
		Set<String> diffrent = new HashSet<String>(farmanimals);
		diffrent.remove(farmanimals);
	}

}
