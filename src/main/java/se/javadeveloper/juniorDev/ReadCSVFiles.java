package se.javadeveloper.juniorDev;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReadCSVFiles {

	public static void main(String[] args) {
		ArrayList<String[]> data2 = new ArrayList<String[]>();

		Map<Integer,String[] > data = new HashMap<Integer,String[]>();

		String filePath ="C:\\dev\\juniorDev\\readmeFile\\file.csv";
		String testRow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));

			for(int i = 0; (testRow = br.readLine()) != null; i++){
				//System.out.println(testRow);
				String[] tester = testRow.split(",");
				data.put(i,tester);

			}
			for( int key : data.keySet()){
//				System.out.println("values" + key);
				System.out.println(key+"....................................................");
				System.out.println("[KEY : "+key +". Value "+ data.get(key)+" ]");
			}
			System.out.println("Härkommer ettan: "+data.get(1));
			for (String[] strings : data2) {
				System.out.print("[ ");

				for (String field : strings) {
					System.out.print(field+", ");
				}
				System.out.println("]");
			}


			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();



		}

	}
}
