package types_of_variables;

public class statest3 {
	int c=12;                       //  non static golabal variable
	public void m1()
	{
		int a=10;                     // local variable  //10,12
		System.out.println(a);
		System.out.println(c);
	}
	public void m2()
	{
		int b=11;                      //local variable 11,12
		System.out.println(b);
		System.out.println(c);
	}

}
