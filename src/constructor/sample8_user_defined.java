package constructor;

public class sample8_user_defined {
	int num1;                       //variable declaration
	int num2;
	 sample8_user_defined()
	{
		num1=20;                       //variable initialisation
		num2=30;
	}
public void add()
{
	System.out.println("add="+(num1+num2));
}
public static void main(String[] args) {
	sample8_user_defined s8=new sample8_user_defined();
	s8.add();
	sample9 s9=new sample9();
	s9.sub();
}
}
