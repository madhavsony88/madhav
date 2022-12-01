package types_of_variables;

public class test2 {
	public static void main(String[] args) {
		test2 t2=new test2();
		t2.m1();
		t2.m2();
	}
	
	int c=10;                                      //global variable=outside the block or method
	public void m1()
	{
		int a=20;                                  //local varaible inside the method or block
		System.out.println(a);
		System.out.println(c);
	}
	public void m2()                                       //m1 is method name
	{
		int b=25;
		System.out.println(b);
		System.out.println(c);
	
	}

}