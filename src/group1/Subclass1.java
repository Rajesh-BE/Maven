package group1;

public class Subclass1 extends Superclass{
public void cooking() {
	System.out.println("Cooking");
}	
public void exploring() {
	System.out.println("Exploring");
}
public static void main(String[] args) {
	Subclass1 ref=new Subclass1();
	ref.occupation();
	ref.hobbie();
	ref.cooking();
	ref.exploring();	
	
}
}