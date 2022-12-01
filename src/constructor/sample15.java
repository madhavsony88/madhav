package constructor;

public class sample15 {
	int num1;                    //10
	int num2;                      //20
	sample15(int a,int b)           //user defined with int parameter constructor
	{
		num1=a;
		num2=b;
		
	}
	public void addi() {
		System.out.println(num1+num2);          //20
	}
	public void multi() {
		System.out.println(num1*num2);         //200
	}
	public static void main(String[] args) {
		sample15 r1=new sample15(10,20);
		r1.addi();
		r1.multi();
		System.out.println("--partion--");
	   
	}

}
