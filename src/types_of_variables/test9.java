package types_of_variables;

public class test9 {
	
	static int a=111;
	static int d=105;
	public static void main(String[]ar) {
		System.out.println(a);
		m1();
		System.out.println(test6.b);      //static global variable call frm diff class//class name.variable
		test9 t9=new test9();
	   t9.m2();
	   
	}
	public static void m1() {
		System.out.println(a);
	}
public void m2() {
	System.out.println(d);
}
}
