package additon_sub;

public class test5 {
	public static void main(String [] ar) {
		add(20,30);
		test5 t5=new test5();
		t5.multi(6, 8);
		sub(30,5);
		
	}

	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public void multi(int a,int b) {
		System.out.println(a*b);
	}
	public static void sub(int d,int c) {
	
		
		System.out.println(d-c);
	}
}
