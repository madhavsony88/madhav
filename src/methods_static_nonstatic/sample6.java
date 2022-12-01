package methods_static_nonstatic;

public class sample6 {
	public static void main(String [] args) {
		sample6 s6=new sample6();
		s6.b1();
		s6.b2();
		s6.b2();
		
		System.out.println("good day");
	}
	public void b1( ) {
		System.out.println("running non static regular method from same class b1");
		
		
				
	}
 
	public void b2( ) {
		System.out.println("running non static regular method from same class b2");
		
	}
}
