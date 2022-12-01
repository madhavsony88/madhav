package Arrays;

public class sample5_row_coloumn {
	public static void main(String[] args) {
		
		int[][] cm=new int[2][3];       // 
		                              //   10 12  9
		                             //    3  2  50
		cm[0][0]=10;
		cm[0][1]=12;
		cm[0][2]=9;
		cm[1][0]=13;
		cm[1][1]=32;
		cm[1][2]=50;
		
		System.out.println(cm[0][2]);
		
		System.out.println("+++print data +++");
		for(int i=0;i<=1;i++) {
			
			for(int j=0;j<=2;j++) {
				System.out.print(cm[i][j]+"  ");
			}
			
			System.out.println();
			
		}
		
	}
	}


