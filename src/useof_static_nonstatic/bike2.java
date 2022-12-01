package useof_static_nonstatic;

public class bike2 {
	
	public static void main(String[] args) {
		bike b1=new bike();
		b1.bmodel="scooty";
		b1.bcc=100;
		b1.bcolor="white";
		bike.company="hero";
		
		bike b2=new bike();
		b2.bmodel="pulsar";
		b2.bcc=150;
		b2.bcolor="black";
		bike.company="bajaj";
		
		b1.binfo();
		b2.binfo();
	}

}
