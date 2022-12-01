package Logical_programm;

import java.util.Scanner;

public class Example6_PalindromeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num = sc.nextInt();
		int orgnum=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orgnum==rev) {
			System.out.println(" num is palimdrome");
		}
		else {
			System.out.println("num is not plindrome num");
		}
	}

}
