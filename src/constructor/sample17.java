package constructor;

public class sample17 {
	int num1;
	int num2;
	int num3;
	sample17(int a,int b,int c){            //user defined
		num1=a;
		num2=b;
		num3=c;
	}
	public void addi() {
		System.out.println("addition="+(num1+num2+num3)+"=====multi==  "+num1*num2);
	}
	public void multi() {
		System.out.println(num1*num2*num3);
	}
	public static void main(String[] args) {
		sample17 s1=new sample17(20,10,30);
		s1.addi();
		s1.multi();

	}

}
