package ExceptionHandling;

public class example1 {
	public static void main(String[] args) {
		
		int[] p1=new int[4];         //0 to 3
				
		try {
					p1[1]=3;   //risky code
									}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArreyIndexoutofBoundsException");
	}
	
	System.out.println("Hi");
	System.out.println("win");
	}

}
