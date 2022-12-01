package AccessSpecifiers;

public class sample10 {
public int num5;
public sample10() {
num5=1000;
}
public void gauri() {
	System.out.println(num5);
	
}
public static void main(String[] args) {
	sample10 s10=new sample10();
	s10.gauri();
	System.out.println(s10.num5);
}
}