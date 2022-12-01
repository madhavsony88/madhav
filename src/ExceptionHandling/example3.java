package ExceptionHandling;

import java.rmi.AccessException;

public class example3 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int div=0;
		try {
			div=a/b;       //10/0
		}
		catch(ArithmeticException e) {
			System.out.println("ArithematicexceptionHandled");
			
		}
		
		System.out.println(div);
	System.out.println("wel come");
	
	
	}

}
