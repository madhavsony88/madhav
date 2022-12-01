package Logical_programm;

import java.util.Scanner;

public class example_AcceptInput_fmUser {
	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int num1=s1.nextInt();
	int num2=s1.nextInt();
	System.out.println("c="+num1*num2);
	System.out.println("additon of two num");
	int a=s1.nextInt();
	int b=s1.nextInt();
	System.out.println(a+b);
	System.out.println("enter student name");
	String s5=s1.next();
	System.out.println(s5.length());
	System.out.println(s5.isEmpty());
	String b1="ANIKET";
	System.out.println(b1.indexOf("I"));
	System.out.println(b1.length());
	}

}
