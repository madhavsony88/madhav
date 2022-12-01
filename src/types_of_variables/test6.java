package types_of_variables;

public class test6 {
	
	static int b=101;
	public static void main(String[]ar) {
		System.out.println(b);
		System.out.println("---call from  diff class");
		System.out.println(test5.a);         //call from diff class.class name.variable name    
   	}
	public static void m1()
	{
		System.out.println(b);
	}
	public void m2() {
     System.out.println(b);
	}

}
