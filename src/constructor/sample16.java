package constructor;

public class sample16 {
	
	int num1;
	int num2;
	sample16(int a,int b){
		num1=a;
		num2=b;
		
	}
	public void sub() {
		System.out.println(num2-num1);
			}
	public void multi()
	{
		System.out.println(num1*num2);
	}
	public static void main(String[] args) {
		sample16 s1=new sample16(50,50);
		s1.sub();                      //object name .method name
		s1.multi();
		System.out.println("-----partb----");
		sample16 p1=new sample16(40,200);
		p1.multi();
		p1.sub();
	}

}
