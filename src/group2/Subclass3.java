package group2;
import group1.Subclass2;
public class Subclass3 extends Subclass2{

public void scientist() {
	System.out.println("Scientist");
}	
public void working() {
	System.out.println("Working");
}
public static void main(String[] args) {
	Subclass3 ref=new Subclass3();
	ref.scientist();
	ref.working();
	ref.occupation();
	ref.hobbie();
	ref.cooking();
	ref.exploring();
	ref.engineer();
	ref.studyingbooks();
}

}
