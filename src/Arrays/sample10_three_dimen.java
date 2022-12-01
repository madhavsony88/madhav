package Arrays;

public class sample10_three_dimen {
	public static void main(String[] args) {
		
	int[][][] p1= {{{10,4},{10,32,25,45},{5,10,20}}};
	System.out.println(p1[0][1][0]);
	
	for(int i=0;i<=p1.length-1;i++) 
	{
		
		for(int j=0;j<=p1[i].length-1;j++) {
		
		
			for(int k=0;k<=p1[i][j].length-1;k++) {
			
				System.out.print(p1[i][j][k]+" ");
			}
			System.out.println( );
		}
			
	}
	}

}

