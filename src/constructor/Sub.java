package constructor;

public class Sub extends Super{
	public Sub() {
		super("Iam 23 years old");
		System.out.println("I have a bachelors degree in CSE");
	}
	public Sub(String b) {
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		Sub ref=new Sub("Iam Rajesh kumar");
		Sub ref1=new Sub();
	    System.out.println(ref);
	    System.out.println(ref1);
		
	}

}
