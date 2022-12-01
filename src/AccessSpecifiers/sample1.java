package AccessSpecifiers;

public class sample1 {
	int num1;           //example of private access specifier
	
	sample1() {
		num1=100;
	}
	private void a1() {
		System.out.println(num1);
	}
	public static void main(String[] args) {
		sample1 s1=new sample1();
		s1.a1();
		System.out.println(s1.num1);
	}
	

}
