package AccessSpecifiers;

public class sample4 {
	public static void main(String[] args) {         // in default access specifiers call from diff class
		sample3 s3=new sample3();                   // call class of sample3 and create object
		s3.r1();
		System.out.println(s3.num1);
	}

}
