package types_of_variables;

public class test10 {
	int k=55;
	int n=44;
	int l=33;
	public static void main(String[]ar) {      //non static variable call frm same class
		  System.out.println("Non static method");
		test10 t10 = new test10();              //create obect
		  System.out.println(t10.k);             //object name.variable name
	      m1();
	      System.out.println(t10.l);
	      t10.m2();
	}
public static void m1() {
	      test10 t10=new test10(); 
	System.out.println(t10.n);
}
public void m2() {
	System.out.println(l);
}
}