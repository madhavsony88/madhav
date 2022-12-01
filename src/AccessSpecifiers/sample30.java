package AccessSpecifiers;

public class sample30 {
	private int num5;
	private sample30() {
		num5=700;
	}
		
		private void vi() {
			System.out.println(num5);
		}
	
public static void main(String[] args) {
	sample30 pract=new sample30();
	pract.vi();
	System.out.println(pract.num5);
}
}
