package ExceptionHandling;

public class example4 {
	public static void main(String[] args) {
		int[]k1=new int[4];         // 0 to 3
		try {
			k1[7]=20;                   //risy code
		}
		catch(ArithmeticException a) {
			System.out.println("ArithmeticExceptionhandled");
		}
		catch(StringIndexOutOfBoundsException b) 
		{
		System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch(ArrayIndexOutOfBoundsException c) {
			System.out.println("ArrayIndexOutOfbond exception sHandled");
		}
		
		System.out.println("HI");
	System.out.println("Gm");
	
	}

}
