package types_of_variables;

public class test15 {
	static int a=500;
	public static void main(String[]ar) {
		System.out.println("------");
		System.out.println(a);
		s1();
	    test15 g=new test15();
	    g.s2();
	    System.out.println(test12.a);                         //call frm diff class---diff class name.variable
	System.out.println(test4.s);
	
	}
	int b=200;
	public static void s1() {                       //static regular method
		System.out.println(a);
		System.out.println("-----");
	}
	int d=300;
public void s2() {             //non static regular method
	System.out.println(d);
}
}
