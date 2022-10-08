package task8;

public class Switch3 {
	public static void main(String[] args) {
		int number=45;
		String size;
		switch (number) {
		case 20 :
			 size="small";
			break;
		case 30:
			size="medium";
			break;
		case 40:
			 size="average";
			break;
		case 45:
			size="large";
			break;

		default:
			size="unknown";
			break;
}
		System.out.println("size:" + size);
		
		
	}

}
