package constructor;

public class sample20 {
	
	int a;
	int b;
	int c;
	sample20(int k,int l,int m){
		a=k;
		b=l;
		c=m;
		
	}
public void multi() {
	System.out.println("multi==="+(a*b*c)+";--Addition=="+(a+b+c));
}
public static void main(String[] args) {
	sample20 s1=new sample20(10,20,30);
	s1.multi();

}
}
