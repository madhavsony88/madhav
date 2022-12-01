package Interface_implementations_class;

public class demo2 implements demo1 {      //demo --> interfaceName
	
	public void m1() {
		System.out.println(a);      //static final int a=10;
		System.out.println("method m1 from interface demo1 completed in IC");   //abstract public void m1();
	}
	public void m2() {
		System.out.println("method m2 from interface demo1 completed in IC");
	}

}
