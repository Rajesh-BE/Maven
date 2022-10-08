package application_form;

public class Introduction {
private void student1(String a,int b,String c,String d,double e) {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
}
private void student2(String f,int g,String h,String i,double j) {
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	System.out.println(i);
	System.out.println(j);
}	
public static void main(String[] args) {
	Introduction ref=new Introduction();
	ref.student1("Rajesh", 22, "abc@gmail.com", "CSE", 7.44);
	ref.student2("Varun", 22, "def@gmail.com", "EEE", 7.23);
	
}

}
