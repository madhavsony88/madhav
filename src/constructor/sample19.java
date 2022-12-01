package constructor;

public class sample19 {
	String stname;
	int rnum;
	float sper;
	char grade;
	sample19(String name,int rolln,float per,char sgrade) {
		stname=name;
		rnum=rolln;
		sper= per;
		grade=sgrade;
		
	}
	public void maa() {
		System.out.println(stname+"    "+rnum+"  "+"  "+sper+"  "+grade);
	}
public static void main(String[] args) {
	sample19 mi=new sample19("madhav",100,85.6f,'A');
	mi.maa();
}
}
