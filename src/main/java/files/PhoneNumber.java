package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumber {

	public static void main(String[] args) {
		// read file for phonenumbers
		
		//10 siffror
		// 112 kan fungera som ett nummer
		
		String fileName = "C:\\dev\\juniorDev\\readmeFile\\phonenumber.txt";
		String phonNumberFromFile = null;
		File file = new File(fileName);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			phonNumberFromFile = br.readLine();

			System.out.println("Phone number " + phonNumberFromFile);
			 br.close();
		} catch (FileNotFoundException e ) {
			System.out.println("file not found.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Phone number to validate " + phonNumberFromFile);
		
		if (phonNumberFromFile.length()== 10 || phonNumberFromFile.length() == 3) {
			System.out.println("valide phone number!");
			
		}else if (phonNumberFromFile.length() > 3 || phonNumberFromFile.length() <=9 || phonNumberFromFile.length() < 10 ) {
			
			System.out.println("not valid phone number it's \"" + phonNumberFromFile.length()+"\" number");
			
		}
		
		
		
		
		

	}

}
