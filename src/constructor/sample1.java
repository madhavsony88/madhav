package constructor;

public class sample1 {
	sample1()                //examp:-default constructor//provide by compiler:-same class
	                           //use to copy all data into object
	{
               }

	
	public void m1() {
		System.out.println("GM----running non static regular method m1 from same class");
	}
public static void main(String[]ar)
{
	sample1 s1=new sample1();
	s1.m1();
	sample2 s2=new sample2();    // class name object name(refer name)= new blank object constructor use cpyall data
	s2.m2();                      //call frm diff class sample2
	
}
}




