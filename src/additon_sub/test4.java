package additon_sub;

public class test4 {
	public static void main(String [] ar) {
		add(20,10);
		add(23,23);
		test4 t4=new test4();
		t4.multi(3, 4, 5);
		t4.multi(2, 4, 8);
		test3.add(10,20);

	}



	public static void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
     public void multi(int a,int b,int c)
     {
	System.out.println(a*b*c);
}


}



