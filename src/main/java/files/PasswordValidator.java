package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class PasswordValidator {

	public static void main(String[] args) {

		// file path
		String filePath = "C:\\dev\\juniorDev\\readmeFile\\Password.txt";
		String[] test = new String[12];

		// java file
		File file = new File(filePath);

		// reader
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < 12; i++) {
				test[i] = br.readLine();
				System.out.println(test[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("can't readFile");
			e.printStackTrace();
		
			}
		for (int j = 0; j < 12; j++) {
			
//			Pattern p = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
//			Matcher m = p.matcher(test[j]);
//			boolean b = m.find();
//
//			if (b)
//			   System.out.println("There is a special character in my string");
			if (test[j].matches("[^A-Za-z0-9]" )){
				String t= test[j];
				System.out.println(test[j]+" har bokstäver!!!!!");
				
			} 
		}
	}
}




