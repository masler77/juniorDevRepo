package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read {

	public static void main(String[] args) throws IOException {

		String fileName = "C:\\dev\\juniorDev\\readmeFile\\readme.txt";
		
		File file = new File(fileName);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		
		String text = br.readLine();
		
		System.out.println("text in file: " + text);
		
		br.close();
	}

}
