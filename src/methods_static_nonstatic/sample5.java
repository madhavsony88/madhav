package methods_static_nonstatic;

public class sample5 {
	public static void main(String [] args)
	{
		
		sample5 s5=new sample5();
		         s5.b2();
				 s5.b1();
		         s5.b3();
		
	}
public  void b1() {
	System.out.println("running non static regular method from same class b1");
	
	
}

public void b2()
{
	System.out.println("running non static regular method from same class b2");
	
}

public void b3()
{
	System.out.println("running non static regular method from same class b3");
}
}
