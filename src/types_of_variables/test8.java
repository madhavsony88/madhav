package types_of_variables;

public class test8 {
   public static void main(String[]ar) {
	   
	   System.out.println("local variable with global varia");
	   test8 t8=new test8();
	   t8.m1();
	   t8.m2();
	   
	   
   }
	
	
	int g=520;                                 //non static global variable

	public void m1() {
		int a=400;                               //local variable
		System.out.println("----:-"+a);
		System.out.println("----:-"+g);
			}
	public void m2() {
		int b=300;                                   //  local variable
		System.out.println("----:-"+g);                            //520
		System.out.println("------"+b);	
	}
}
