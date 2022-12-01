package control_statement;

public class examp6_nested1 {
 public static void main(String[] args) {
	   int pexam=250;
	   if (pexam>=300)
			   {
		   System.out.println("qualify for mexam");

	         int mexam=500;
	         if(mexam>=700)
	        		 {
	        			System.out.println("got selected"); 
	        		 }
	         else
	         {
	        	 System.out.println("rejected for selection");
	         }}
	         else
	         {
	        	System.out.println("rejected for mexam exam"); 
	         }
}

}
