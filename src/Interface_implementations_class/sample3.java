package Interface_implementations_class;

public class sample3 implements demoA1,demoA2 {
  ///implementation class
	//example of multiple inheritance using interface
	
	public void k1() {
		System.out.println("method k1 from interface I1 completed in IC");
	}
	public void k2() {
		System.out.println("method k2 from interface I1 completed in IC");
	}
	public void k3() {
		System.out.println("method k3 from interface I2 completed in IC");
	}
	public void k4() {
		System.out.println("method k3 from interface I2 completed in IC");
	}
}
