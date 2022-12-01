package AccessSpecifiers;

public class sample3 {
	
	int num1;        // global varaible                //example of default access specifiers
	sample3(){       // constructor without parameter                         //default
		num1=50;
	}
	void r1() {            // method                    //default

		System.out.println(num1);
	}
public static void main(String[] args) {
	sample3 s3=new sample3();
	s3.r1();
	System.out.println(s3.num1);
}
}
