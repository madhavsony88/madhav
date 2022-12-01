package types_of_variables;

public class test4 {
	
	static int s=99;
	public static void main(String[]ar) {         // global static var call frm same class
		
		
		System.out.println(s);
		System.out.println(" call frm diff class");
		System.out.println(test5.a);            //class name.vriable           //global var call frm diff class
		
		test4 t4=new test4();
	    t4.z2();
		z1();
	}
	public static void z1() {
		System.out.println(":="+s);
	}
	public void z2() {
		int b=33;
		System.out.println(b);
		System.out.println(":="+s);
	}
	

}
