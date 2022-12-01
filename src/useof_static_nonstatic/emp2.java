package useof_static_nonstatic;

public class emp2 {
	public static void main(String[] args) {
		emp1 e1=new emp1();
		e1.stdname="Rakesh";
		e1.srollnum=55;
		emp1.prinname="abc";
		
		emp1 e2=new emp1();
		e2.stdname="vishal";
		e2.srollnum=56;     //e2.prinname="xyz";
		emp1.prinname="abc";
		
		emp1 e3=new emp1();
		e3.stdname="govind";
		e3.srollnum=57;
		emp1.prinname="xyz";
		
		e1.stdinfo();
		e2.stdinfo();
		e3.stdinfo();
	}

}
