package control_statement;

public class examp3_if_else {
	public static void main(String []ar) {
		int stdper=50;
		if(stdper>=90)
		{ System.out.println("Assingn grade A");
		
		}
		else if(stdper>=75 & stdper<=89)
		{
			System.out.println("assign grade B");
		}
		else if(stdper>=60 & stdper<=74)
		{
			System.out.println("assign grade c");
		}
		else
		{
			System.out.println("assign grade d");
		}
	}

}
