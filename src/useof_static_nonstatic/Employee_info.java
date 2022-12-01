package useof_static_nonstatic;

public class Employee_info {
	public static void main(String[] args) {
		
		Emp e1=new Emp();                             //one emp data create one object
		e1.empname="madhav";
		e1.empID=1000;
		e1.empceoname="abc";
	
	System.out.println("----hi---");
	   Emp e2=new Emp();
	   e2.empname="Gansesh";
	   e2.empID=1001;
	   e2.empceoname="abc";
	   System.out.println("--HI---");
	   Emp e3=new Emp();
	   e3.empname="Gauravi munde";
	   e3.empID=1002;
	   e3.empceoname="xyz";
	   
	   e1.info();
	   e2.info();
	   e3.info();
	   
	}
	

}
