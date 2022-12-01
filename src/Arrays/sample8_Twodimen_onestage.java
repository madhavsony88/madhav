package Arrays;

public class sample8_Twodimen_onestage {
	
	public static void main(String[] args) {
		
		int[][] p1= {{10,20,15},{12,00,16}};
		
		System.out.println(p1[0][1]);
		for(int i=0;i<=1;i++) {
			
			for(int j=0;j<=2;j++)	{
				
				System.out.print(p1[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
