package AccessSpecifiers;

public class sample20 {
	protected int num;
	protected sample20(){
		num=900;
	}
	protected void latur() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		sample20 s20=new sample20();
		s20.latur();
		System.out.println(s20.num);
	}

}
