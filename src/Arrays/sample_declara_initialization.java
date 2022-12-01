package Arrays;

import java.util.Arrays;

public class sample_declara_initialization {
	public static void main(String[] args) {
		String[] pm= {"rahul","om","Anjali","Gauravi"};
		   System.out.println("==print all name==");
		
		   for(int i=0;i<=pm.length-1;i++) {
		   System.out.println(pm[i]);}
		   
		   System.out.println("==print data in alphabetical order==");
		   Arrays.sort(pm);
		   for(int i=0;i<=pm.length-1;i++) {
			   System.out.println(pm[i]);
		   }
		   
		   
		   
	}

}
