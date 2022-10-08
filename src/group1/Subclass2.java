package group1;

public class Subclass2 extends Subclass1{
public void engineer() {
	System.out.println("Engineer");
}	
public void studyingbooks() {
	System.out.println("Studying books");
}
public static void main(String[] args) {
	Subclass2 ref=new Subclass2();
	ref.occupation();
	ref.hobbie();
	ref.cooking();
	ref.exploring();
	ref.engineer();
	ref.studyingbooks();
}
}
