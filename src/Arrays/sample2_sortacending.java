package Arrays;

import java.util.Arrays;

public class sample2_sortacending {
public static void main(String[] args) {
		
		int[] ar=new int[4];
		ar[0]= 10;
		ar[1]= 5;	
		ar[2]= 15;  
		ar[3]= 20;
		
		System.out.println("===print all data==");
		System.out.println(ar.length);
		
		Arrays.sort(ar);
		
		System.out.println("==acending order===");
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("===print decending order==");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}
		
		
		
}
}
