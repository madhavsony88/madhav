package AccessSpecifiers;

public class sample21 {
protected int num2;
protected sample21(){
	num2=90;
}
protected void w1() {                                  //protecred type access specifiers same class
	System.out.println(num2);

}
public static void main(String[] args) {
	sample21 s21=new sample21();
	s21.w1();
	System.out.println(s21.num2);
}
}
