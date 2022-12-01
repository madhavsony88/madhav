package constructor;

public class sample18 {
	int num1;
	int num2;
	int num3;
	sample18(int a,int b,int c){
		num1=a;
		num2=b;
		num3=c;
	}
	public void multi() {
		System.out.println(num1*num2*num3);
		
	}
	public void sub() {
		System.out.println("sub=="+(num3-num2-num1));
	}
	public static void main(String[] args) {
		
		sample18 s1=new sample18(40,50,60);
		s1.multi();
		s1.sub();
	}

}
