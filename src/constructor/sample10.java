package constructor;

public class sample10 {

	int a;
	int b;
	int e;
	int f;
	sample10()
	{
		a=15;                             
		b=10;	
		e=35;
		f=55;
	}
	public void multi() {
		System.out.println("d="+(a*b)+"     :-"+(b*e));
	}

	
	public static void main(String[] args) {
		sample10 go=new sample10();
	go.multi();
	sample9 s9=new sample9();
	s9.sub();
	}
}
