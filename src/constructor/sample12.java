package constructor;

public class sample12 {
	int a;
	int b;
	int c;
	sample12(){
		a=20;
		b=20;
		c=10;
	}
	public void mult() {
		System.out.println("d:="+(a*b*c));
	}
	public static void main(String[] args) {
		sample12 s12=new sample12();
		s12.mult();
		sample10 go=new sample10();
		go.multi();
	}

}
