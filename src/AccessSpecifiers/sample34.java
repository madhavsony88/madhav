package AccessSpecifiers;

public class sample34 {
	protected String name;
 protected sample34() {                        //access specifiers in samme class
	 name="Gauravi";
	 
 }
 protected void q() {
	 String sname="Sonhivare";
	
	 System.out.println(sname);
 }
 public static void main(String[] args) {
	sample34 s34=new sample34();
	s34.q();
	System.out.println(s34.name);
}
}
