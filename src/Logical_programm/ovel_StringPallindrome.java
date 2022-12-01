package Logical_programm;

import java.util.Scanner;

public class ovel_StringPallindrome {
	public static void main(String[] args) {
            
                   
		
		String org="madam";
		 String rev="";
		
		 for(int i=org.length()-1;i>=0;i--) {
			 
			 rev=rev+org.charAt(i);
			 
			 
		 }
		 System.out.println("original string  "+org);
		 System.out.println("revString  "+org);
		 if(org.equals(rev)) {
			 System.out.println("GivenString is pallindrome");
		 }
		 else {
			 System.out.println("Given String is not pallindrome");
		 }
}
}