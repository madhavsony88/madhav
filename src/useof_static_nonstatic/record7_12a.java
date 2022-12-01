package useof_static_nonstatic;

public class record7_12a {
	public static void main(String[] args) {
		record7_12 r1=new record7_12();
		r1.fname="madhav Munde";
		r1.farea=10;
		record7_12.surveyno=50;
		
		record7_12 r2=new record7_12();
		r2.fname="prashant munde";
		r2.farea=20;
		record7_12.surveyno=60;
		
		record7_12 r3=new record7_12();
		r3.fname=" Govind munde";
		r3.farea=30;
		record7_12.surveyno=100;
		
		r1.farminfo();                                  //object name.method name
		r2.farminfo();
		r3.farminfo();
	}

}
