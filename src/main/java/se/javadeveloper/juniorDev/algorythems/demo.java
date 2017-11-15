package se.javadeveloper.juniorDev.algorythems;

public class demo {

	public static void main(String[] args) {

		int[] number = {1,2,3,44,55,66,245,8764,212,222};
		int[] sortedNumbers = {3,5,7,9,12,14,66,77,444,3333,23332,4554435,6236777,342234432};
		//call a functions that search for aspecific number
		
		int pos = se.javadeveloper.juniorDev.algorythems.search.linearSearch(number, 66);
		
		System.out.println("här kommeer linearSearch: "+ pos);
		
		
		int pos2 = se.javadeveloper.juniorDev.algorythems.search.binarySearch(sortedNumbers, 33,55 , sortedNumbers.length);
		
		System.out.println("här kommer utskriften: "+ pos2);
		
	}

}
