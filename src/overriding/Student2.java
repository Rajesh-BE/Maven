package overriding;

public class Student2 extends Student1{
	private void college_details() {
		System.out.println("SMKFIT"+"\n"+"Engineering college"+"\n"+"Kelambakkam"+"\n"+'b');
}
	public static void main(String[] args) {
		Student2 ref=new Student2();
		ref.college_details();
	}

}
