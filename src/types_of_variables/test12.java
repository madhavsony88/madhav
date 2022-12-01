package types_of_variables;

public class test12 {
	
	static int a=555;
	static int d=333;
	public static void main(String[]args) {
		System.out.println("  static global variable");
		System.out.println(a);
		System.out.println("-------");
		s1();
		test12 golu=new test12();
		golu.s2();
	}
public static void s1() {

	System.out.println(a);
}
public void s2() {
	System.out.println(d);
}
}
