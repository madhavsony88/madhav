

package Logical_programm;

import java.util.Scanner;

public class example4_findoutovelFromword {
	public static void main(String[] args) {
            char srt;
            
		System.out.println("enter any char");
		Scanner s=new Scanner(System.in);
		        srt= s.next().charAt(0);
		
		if(srt=='a'|| srt=='e'||srt=='i'||srt=='o'||srt=='u') {
			System.out.println("char is ovel");
		}
		else {
			System.out.println("char is consonant");
		}
	}

}

