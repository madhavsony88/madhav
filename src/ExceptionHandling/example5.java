package ExceptionHandling;

public class example5 {
public static void main(String[] args) {
	
	int[] z1=new int[5];   //0 to 4
	try {
		z1[7]=18;
	}
	             catch(Exception a)  	{
	            	 a.printStackTrace();
	            	 System.out.println("generic exception hamdled");
	             }
	System.out.println(" whats up");
	System.out.println("hellow");
	
	
	
}
}
