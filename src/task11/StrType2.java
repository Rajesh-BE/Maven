package task11;

public class StrType2 {
	public static void main(String[] args) {
		StringBuffer value=new StringBuffer("rajesh ");
		StringBuffer value1=new StringBuffer("rajesh");
		int identityHashCode = System.identityHashCode(value);
		System.out.println(identityHashCode);
		
		int identityHashCode2 = System.identityHashCode(value1);
		System.out.println(identityHashCode2);
		
		StringBuffer append=value.append(value1);
		System.out.println(append);
		int identityHashCode3 = System.identityHashCode(append);
		System.out.println(identityHashCode3);
	
	}

}
