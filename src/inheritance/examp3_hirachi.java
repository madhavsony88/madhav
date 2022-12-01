package inheritance;

public class examp3_hirachi extends father1{
	public static void main(String[] args) {
		
		son1 s1=new son1();                        //feature of son1 create object for each class
		s1.bike();
		s1.car();
		s1.house();
		s1.money();
		
		System.out.println("feature of son1");
		son2 s2=new son2();                           //feature of son2
	    s2.laptop();
		s2.car();
	    s2.money();
	    s2.house();
	    
	    System.out.println("feature of son2");
	    
	    son3 s3=new son3();                   //feature of son3
	    s3.mobile();
	    s3.money();
	    s3.car();
	    s3.house();
	    System.out.println("feature of son3");
		
			}
	
	
	
         

}
