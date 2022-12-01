package control_statement;

public class switch_6 {
	public static void main(String[] args) 
	{
		int a=50,b=10,result;
		System.out.println("\n");
		
		switch(3)
		{
		case 1 :
			result=a+b;
			System.out.println(result);
			break;
			
		case 2:
			result=a-b;
			System.out.println(result);
			break;
		case 3:
			result=a/b;
			System.out.println(result);
			break;
			default:System.out.println("wrong inputs");
			
		}
		
	}

}
