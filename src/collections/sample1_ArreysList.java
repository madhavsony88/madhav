package collections;

import java.util.ArrayList;

public class sample1_ArreysList {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();//initial capacity 10
	  ar.add("swapnil");
	  ar.add("null");
	  ar.add(101);
	  ar.add('A');
	  ar.add(65.56f);
	  ar.add("null");
	  ar.add(null);
	  System.out.println(ar);
	  System.out.println(ar.size());
	  System.out.println(ar.contains(101)); 
	  
	  System.out.println(ar.get(4));
	  System.out.println(ar.isEmpty());
		
	}

}
