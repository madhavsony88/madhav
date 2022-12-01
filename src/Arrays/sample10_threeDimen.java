package Arrays;

public class sample10_threeDimen {
	public static void main(String[] args) {
		
		
		String [][][]s1= {{{"shiv","ram","jai",},{"sanket","pirayank","jitseh","Ranbirk",},{"prashant","gauri","swapnil"}}};
	                
		for(int i=0;i<=s1.length-1;i++)
		{
			for(int j=0;j<=s1[i].length-1;j++)
			{
				for(int k=0;k<=s1[i][j].length-1;k++)
				{
					System.out.print(s1[i][j][k]+"  ");
				}
				System.out.println();
			}
		}
	}}

