package control_statement;

public class examp2_if_else {
public static void main(String[]ar) {
	
	int user=45;
	if (user<=18)
	{System.out.println("user is 18 or younger");

	}
	else if(user>18 && user<40)
	{
		System.out.println("user age is betwn 19 to 39");
	
	}
	else
	{
		System.out.println("user is older than 40");
	}
	}
}

