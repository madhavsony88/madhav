package additon_sub;

public class test9 {
	public static void main(String[]args) {
		m1();
		test8.stdinfo("m", "n", 10,'A', 15);
		test9 t9=new test9();
		t9.m5();
		test8 t8=new test8();
		t8.add();
	}

	public static void m1() {	
		
		System.out.println(" runnig static regular method");
	}
	public void m5() {
		System.out.println("runnig non static regular method");
	}
}
