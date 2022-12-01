package types_of_variables;

public class test11 {
	
	int s=222;
	public static void main(String[]args) {
		System.out.println("+==global non static variable==+");
		test11 g=new test11();
				System.out.println(g.s);
		System.out.println("--------");
				g1();
				g.g2();
	}
   public static void g1() {
	   test11 g=new test11();
	   System.out.println(g.s);
	   
   }
         public void g2() {
        	 System.out.println(s);
        	 
         }
	
	
}
