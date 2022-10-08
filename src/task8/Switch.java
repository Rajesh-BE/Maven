package task8;

public class Switch {
	public static void main(String[] args) {
		char word='a';
		switch (word) {
		case 'a':case 'e':case 'i':case 'o':case 'u':
			System.out.println("Vowels");
			break;

		default:
			System.out.println("This is not vowel");
			break;
		}
	}

}
