package task8;

public class Switch2 {
	public static void main(String[] args) {
		String
		charname="a";
		switch (charname) {
		case "a":case "e":case "i":case "o":case "u":
			System.err.println("Vowels");
			
			break;

		default:
			System.err.println("This in not vowels");
			break;
		}
	}

}
