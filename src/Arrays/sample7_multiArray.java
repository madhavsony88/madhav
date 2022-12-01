package Arrays;

public class sample7_multiArray {
	public static void main(String[] args) {
		int[] r1= {10,20,25,40,50};            //single dimensional array in one stage
		System.out.println(r1[3]);
		
		System.out.println("++print all int++");
		int sum=0;
         
		
		for(int i=0;i<=r1.length-1;i++)
		{
			System.out.println(r1[i]);
			sum=sum+r1[i];
	}
	         
	        		 System.out.println("sum==="+sum);
          
	}

}
