package constructor;

public class sample21 {
	int num1;
	int num2;
	sample21(int a,int b){                    //constructor with parametr
		num1=a;                          //20
		num2=b;                           //40
		
	}
public void multi() {
	System.out.println( num1*num2);
}
sample21(){                       //constructor without paramtr
	 num1=50;
	 num2=40;
}


public void add()
{
System.out.println(num2+num1);
}
public static void main(String[] args) {
	sample21 s7=new sample21(20,40);
	s7.multi();
	s7.add();
	System.out.println("------");
	sample21 s8=new sample21();
	s8.add();
	s8.multi();
}

}
