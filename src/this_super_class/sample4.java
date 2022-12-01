package this_super_class;

public class sample4 extends sample3 {
	int a=20;              //20,30 g variable of same class  
	int b=30;
	public void multi() {
	int a=10;                        //10,10 local variable
	int b=10;
	System.out.println("multi="+(a*b));
	System.out.println("multification:="+this.a*this.b);                    //30*20global vriable sub class
        System.out.println(super.a+super.b);             ////50+40global vriable sub class
	}

}
