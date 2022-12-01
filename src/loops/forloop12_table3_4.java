package loops;

public class forloop12_table3_4 {
	public static void main(String[] args) {
	
		table(3);
		table(4);
	}

	
	public static void table(int x){
		
		System.out.println("table ::"+x+"\n");
		
		
		for(int i=1;i<=10;i++) 
		{
		System.out.println(i*x);
		}
		
	}

}
