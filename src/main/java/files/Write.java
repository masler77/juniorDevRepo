package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {

		//1. definera filen
		String writeFile = "C:\\dev\\juniorDev\\readmeFile\\WriteToMe.txt";
		
		// skapa filen i java
		File file  = new File(writeFile);
		//3. öppna filen
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			
			//4. skriv till filen.
			bw.write("Skriver till filen hahhaha");
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
