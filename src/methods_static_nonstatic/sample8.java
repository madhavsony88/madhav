package methods_static_nonstatic;

public class sample8 {
	public static void main(String[]args){
		sample8 s8=new sample8();
		s8.b1();
		s8.b2();
		s8.b3();

	}
 public void b1()
 {
	 int a=50;
	 int b=50;
	 System.out.println("addition:="+(a+b));
	 
 }
 public void b2() {
	 int a=10;
	 int b=10;
	 System.out.println("multification:="+(a*b));
	 
 }
 public void b3(){
	 int a=50;
	 int b=30;
	 System.out.println(a-b);
	 
 }
}
