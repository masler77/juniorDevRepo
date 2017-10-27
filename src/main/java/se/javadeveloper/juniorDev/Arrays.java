package se.javadeveloper.juniorDev;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		String[] alfabet ={"a","b","c","d"};
		System.out.println("---old----");
		for(int i=0;i <4; i++){
			System.out.print(alfabet[i]);
		}
		System.out.println("---mellan----");
		for(int n=0;n <alfabet.length; n++){
			System.out.print(alfabet[n]);
		}

		System.out.println("---foreach----");

		for(String letter : alfabet){
			System.out.print(letter+ "  ");
		}

		String[][] users ={
				{"magnus","kalle","Magnus@kuul.se","12341234123"},
				{"Jenny","kalle3","Jenny@kuul.se","12341234123"},
				{"Emilia","kall4","emilia@kuul.se","12342134334"}
		};

		//get the size of array
		System.out.println("\n\n dubble arrays ");
		int numOfusers = users.length;
		int numOfFields = users[0].length;
		System.out.println("number of users  " + numOfusers );
		System.out.println("number of fields  " + numOfFields);

		for(int i=0; i<numOfusers; i++){
			for(int n=0;n <numOfFields; n++){
				String FirstName ="firstname:" +users[i][n];
				//						String lastName = user[][]
			}
		}

		System.out.println("\n\n dubble foreach ");

		for(String[] user : users){
			System.out.print("[ ");
			for(String field : user){
				System.out.print(field +" ");
			}
			System.out.println(" ]");
		}

//tutorial point arraylist foreach
		ArrayList<String> list = new ArrayList<String>();  
		list.add("Tutorials");  
		list.add("Point");  
		list.add("India PVT Limited");
		for(String s:list) { 
			System.out.println(s);  
		}
		List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        System.out.println("------------Iterating by passing lambda expression---------------");  
        gamesList.stream().forEachOrdered(games -> System.out.println(games));  
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList.stream().forEachOrdered(System.out::println);  

        List<String> gamesList2 = new ArrayList<String>();  
        gamesList2.add("Football");  
        gamesList2.add("Cricket");  
        gamesList2.add("Chess");  
        gamesList2.add("Hocky");  
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList2.forEach(System.out::println);  



	}   
} 




