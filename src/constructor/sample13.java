package constructor;

public class sample13 {
	int a;
	int b;
sample13(){
	a=25;
	b=20;
}
public void maa() {
	System.out.println("multi.add of three num===="+(a*a+b));
}
public static void main(String[] args) {
	sample13 s13=new sample13();
	s13.maa();
	sample9 s9=new sample9();
	s9.sub();
	sample14 s14=new sample14();
	s14.maa();
	
}
}
