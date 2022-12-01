package constructor;

public class sample4 {
	sample4()
	{
		
	}
public static void main(String[] args) {
	sample4 s4=new sample4();
	s4.g1();
	sample2 s2=new sample2();
	s2.m2();
}

public void g1() {
	int a=10;
	
	System.out.println(a);
}
}
