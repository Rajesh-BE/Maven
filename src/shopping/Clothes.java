package shopping;

public class Clothes extends Sales implements Items {

	public void bag(String a , int c) {
		System.out.println(a+"="+c);
	}

	public void book(String d, int e) {
		System.out.println(d+"="+e);
	}

	public void phone(String f, int g) {
		System.out.println(f+"="+g);
	}

	public void camera(String h, int i) {
		System.out.println(h+"="+i);
	}

	public void bat() {
		System.out.println("Addidas");
	}

	
	public void ball() {
		System.out.println("Vickey");
	}
	
	public void shoes() {
		System.out.println("Nike");
	}

	
	public void gloves() {
		System.out.println("Football gloves");
	}

	public void firstAidKit() {
		System.out.println("For Emergency");
	}
	public static void main(String[] args) {
		Clothes ref=new Clothes();
		ref.bag("School bag", 500);
		ref.book("Java", 399);
		ref.phone("Vivo", 19999);
		ref.camera("Cannon", 50000);
		ref.ball();
		ref.bat();
		ref.gloves();
		ref.firstAidKit();
		
		
	}
}

