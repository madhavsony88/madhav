package AccessSpecifiers1;

import AccessSpecifiers.sample3;

public class sampleA1{
	public static void main(String[] args) {        //we cant access diff package class in default
		sample3 s3=new sample3();
		s3.r1();
		System.out.println(s3.num1);
	}

