package additon_sub;

public class test8 {
     public static void main(String [] ar) {
    	 stdinfo("Raghav madhav munde","latur",105,'A',75.5f);
    	 test8 t8=new test8();//create object of same class
    	 t8.div(200,50);     //object name.method name
    	 t8.add();
    	 test6 t6=new test6();
    	 t6.stdname("Ganesh","munde");
     }
     
     public static void stdinfo(String fn,String add,int sroll,char grade,float sper) {
		System.out.println(fn+" "+add+" "+sroll+" "+grade+" "+sper);
		
	}
     public void add() {
    	 int a=10;
    	 int b=20;
    	 System.out.println("c="+(a+b));
     }
     public void div(int a,int b) {
    	 System.out.println("c="+(a/b));
     }
     
}

