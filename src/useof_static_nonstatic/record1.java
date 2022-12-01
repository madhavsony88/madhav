package useof_static_nonstatic;

public class record1 {
	
	String fname;
	int land;
	int surveyno;
	static String village;
	public void frminfo(){
		System.out.println(fname+" :: "+land+" :: "+surveyno+" :: "+village);
	}

}
