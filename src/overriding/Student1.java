package overriding;

public class Student1 {
  private void college_details() {
	System.out.println("SMKFIT"+"\n"+"Engineering college"+"\n"+"Kelambakkam");
}
public static void main(String[] args) {
	Student1 ref=new Student1();
	ref.college_details();
}  
}
