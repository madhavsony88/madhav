package types_of_variables;

public class test1 {
	public static void main(String[] args) {
		test1 t1=new test1();                // create object
			t1.m1();                          //object name.method name
		t1.m2();
		
	}
	
	public void m1()
	{
		int a=30;                                  //local varaible inside the method or block
		System.out.println(a);
	}
	public void m2()                                       //m1 is method name
	{
		int b=40;
		System.out.println(b);
	}

}
