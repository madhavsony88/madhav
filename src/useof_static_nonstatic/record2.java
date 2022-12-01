package useof_static_nonstatic;

public class record2 {
	public static void main(String[] args) {
		record1 r1=new record1();
		r1.fname="Govind";                       //(object name.variable name=assign value)
		r1.land=23;
		r1.surveyno=45;
		record1.village="latur";
		
		record1 r2=new record1();
		r2.fname="suresh";                       //(object name.variable name=assign value)
		r2.land=24;
		r2.surveyno=46;
		record1.village="pune";
		
		record1 r3=new record1();
		r3.fname="vinod";                       //(object name.variable name=assign value)
		r3.land=25;
		r3.surveyno=50;
		record1.village="satara";
		
		r1.frminfo();
		r2.frminfo();
		r3.frminfo();
		
		
		
		
	}

}
