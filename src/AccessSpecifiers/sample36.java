package AccessSpecifiers;

public class sample36 {
	public String name;
	public sample36() {
		name="Ganesh";
		
	}
	public void mh() {
	        int a=1;
		System.out.println(a);
	}
	public static void main(String[] args) {
		sample36 s36=new sample36();
		s36.mh();
		System.out.println(s36.name);
	}

}
