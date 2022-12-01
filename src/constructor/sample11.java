package constructor;

public class sample11 {
	String sname;
	String surname;
	sample11(){
		sname="madhav";
		surname="sonhivare";
	}
	public void ma() {
		System.out.println("std name=="+sname+"  "+surname);
		System.out.println("surname=="+surname);
	}
public static void main(String[] args) {
	sample11 s11=new sample11();
	s11.ma();
}
}
