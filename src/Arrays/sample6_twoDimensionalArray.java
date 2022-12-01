package Arrays;

public class sample6_twoDimensionalArray {

public static void main(String[] args ) {
	

	int[][][] r1= new int[3][3][3];   
          r1[0][0][0]= 23;
          r1[0][0][1]=11;
          r1[0][0][2]=27;
          r1[1][1][0]=35;
          r1[1][1][1]=40;
          r1[1][1][2]=36;
          r1[2][0][0]=25;
          r1[2][0][1]=90;
          r1[2][0][2]=100;
      
         
          System.out.println(r1[0][1][1]);
          
          System.out.println("+++print all int+++");
          for(int i=0;i<=r1.length-1;i++) {
  			
  			for(int j=0;j<=r1[i].length-1;j++) {
  				for(int k=0;k<=r1[i][j].length-1;k++){
  					
  				System.out.print(r1[i][j][k]+"  ");
  			}
  			
  			System.out.println();
          }
                              

}                                 

}}




