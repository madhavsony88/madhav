package Abstract_concrete_class;

abstract public class Second {     //complete method in abstract class
	public void w1(int a,int b) {
		System.out.println(a+b);
	}
	public void w2(String name) {
		System.out.println("name");
	}
   abstract	public void w3(int a,int b) ; //incomplete method 
	abstract public void w4(int a,int b);
		
}
