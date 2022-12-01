package ExceptionHandling;

public class example6 {
	public static void main(String[] args) {
		int[]p1=new int[4];         // 0 to 3
		try {
			p1[7]=30;                   //risy code
		}
		catch(ArithmeticException a) {
			System.out.println("ArithmeticExceptionhandled");
		}
		catch(StringIndexOutOfBoundsException m) 
		{
		System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch(ArrayIndexOutOfBoundsException n) {
			System.out.println("ArrayIndexOutOfbond exception Handled");
		}
		catch(Exception q) {
			System.out.println("Generic exception handled");
		}
		System.out.println("HI");
	System.out.println("Gm");
	
	}

}

