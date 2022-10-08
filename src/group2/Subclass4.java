package group2;
import group1.Superclass;
public class Subclass4 extends Superclass {
	public void programmer() {
		System.out.println("Programmer");	
	
}
	public static void main(String[] args) {
		Subclass4 ref=new Subclass4();
		ref.programmer();
		ref.occupation();
		ref.hobbie();
		}

}
