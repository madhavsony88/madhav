package this_super_class;

public class sample2 extends sample1{
	int a=30;            //  30 global variable from sub class
		
	
	public void m1() {
		int a=20;                                 //  20  local variable
		
		System.out.println(a);                     //20
		System.out.println(this.a);               //30
		System.out.println(super.a);               //100      //super class vaue
		System.out.println(super.b);                //200
	
		
	}

}
