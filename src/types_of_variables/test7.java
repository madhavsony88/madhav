package types_of_variables;

public class test7 {                             //non static method object creation is necessary
	int d=110;                                //non static global variable
	
	public static void main(String[]ar)
	{
		test7 t7=new test7();                 //create object  same class
		System.out.println(t7.d);              //object name .variable
		
		System.out.println("--partition----");
		
		test2 t2=new test2();
		
		System.out.println(t2.c);   //call from different class    // different object name .variable
	
	}
	public static void m1()
	{
		test7 r1=new test7();                       //class name object name=new class name
		System.out.println(r1.d);
	}
	public void m2() {
		System.out.println(d);
	}
}
