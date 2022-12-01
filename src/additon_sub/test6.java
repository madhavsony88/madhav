package additon_sub;

public class test6 {
	public static void main(String [] ar) {
		multi(4,7);
		test6 t6=new test6();
		t6.stdname("Raghav","munde"); 
		
		test7.stdfullname("madhav","munde","latur");
		
	}
    public static void multi(int a,int b) {
    	System.out.println("c="+a*b);
    }
   public void stdname(String name,String b) {
	   System.out.println("name of std="+name+" "+b);
   }
    
}
