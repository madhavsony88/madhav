package constructor;

public class sample22 {
	int num1;
	int num2;
	sample22(){
		num1=20;
		num2=90;
	}
	public void sub() {
		System.out.println("sub=="+(num2-num1)+" multi  "+(num1*num2));
	}
	sample22(int a,int b){
		num1=a;
		num2=b;
	}
	public static void main(String[] args) {
		sample22 p1=new sample22();
		p1.sub();
		System.out.println("----hi----");
		sample22 p2=new sample22(50,50);
		p2.sub();
		System.out.println("--hellow---");       
		sample20 s1=new sample20(10,20,30);          // call from diff class sample20
		s1.multi();
		
	}

}
