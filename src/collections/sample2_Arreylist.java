package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class sample2_Arreylist {
	public static void main(String[] args) {
		
           //ArrayList al=new ArrayList();  //initial capacity=10

		ArrayList al=new ArrayList(8);
		
		al.add("Ganesh");
		al.add(101);
		al.add('A');
		al.add(85.5f);
		al.add("Gauri");
		al.add("null");
		al.add("null");
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		//add info in between arraylist    --> right shift operation
				System.out.println(al);
				al.add(4, "Ramesh");
				System.out.println(al);
				
				//remove info in between arraylist --> left shift operation
				al.remove(6);
				System.out.println(al);
				
				//update/modify info from arraylist
				al.set(1, 102);
				System.out.println(al);
				
				System.out.println("--print all info from arraylist using iterator cursor---");
				Iterator itr = al.iterator();
				while(itr.hasNext())   // true  false
				{
					System.out.println(itr.next());
				}
				
				
				System.out.println("--print all info from arraylist using ListIterator cursor---");
				ListIterator litr = al.listIterator();	
				while(litr.hasNext())
				{
					System.out.println(litr.next());
				}
				
				System.out.println("--print all data using for loop---");
				for(int i=0; i<=al.size()-1; i++)
				{
					System.out.println(al.get(i));
				}
				
				System.out.println("--print all data using foreach loop---");
				for(Object s1 :al )
				{
					System.out.println(s1);
				}
		
		
		
	}

}
