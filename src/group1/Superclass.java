package group1;

public class Superclass {
public void occupation() {
	System.out.println("Actor");
}	
public void hobbie() {
	System.out.println("Dancing");
}
public static void main(String[] args) {
	Superclass ref=new Superclass();
	ref.occupation();
	ref.hobbie();
	
}
}
