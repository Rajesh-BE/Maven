package control_statements;

public class Nested {
	public static void main(String[] args) {
	Double n1=2.5,n2=3.5;
	if (n1<=n2) {
		if (n1>=n2) {
			System.out.println(n2);
		}
		else {
			System.out.println(n1);
		}
		
	}
	else {
		System.out.println("Default");
	}
 }
}
