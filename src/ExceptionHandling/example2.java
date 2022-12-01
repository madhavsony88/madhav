package ExceptionHandling;

public class example2 {
	private static final String StringIndexOutOfBounds = null;

	public static void main(String[] args) {
		
		String s1="Gauravi";           // 0 to 6
		
		try{
			System.out.println(s1.charAt(8));
			System.out.println(s1.isEmpty());
		
		}          //risky code
		
			catch(StringIndexOutOfBoundsException p1) 
		{
			System.out.println("StringIndeOutOf Bonds exception handled");
		}
		System.out.println("gm");
	    System.out.println("hellow");
	
	
	
	}
}

