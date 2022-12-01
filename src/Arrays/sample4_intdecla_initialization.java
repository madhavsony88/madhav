package Arrays;

import java.util.Arrays;

public class sample4_intdecla_initialization {
	public static void main(String[] args) {
		
		int[] km= {10,40,56,35,99};
		System.out.println(km[3]);
		System.out.println(km.length);
		
	Arrays.sort(km);
	System.out.println("==acending order===");
	for(int i=0;i<=km.length-1;i++) {
		System.out.println(km[i]);
		
		
	}
	System.out.println("+++decending order+++");
	for(int i=km.length-1;i>=0;i--) {
		System.out.println(km[i]);
	}
		
	}

}
