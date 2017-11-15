package files;

public class a_letter extends Exception {
	
		String pass;
		public a_letter(String pass) {
			this.pass = pass;			
			// TODO Auto-generated constructor stub
		}
		public String toString(String pass){

			return "password exeption a letter" + pass;
		}
	}

