package types_of_variables;                     //global variable from same class

public class test5 {
	
	static int a=100;                            //global static variables outside method

   public static void main(String[] args) {               //main method 
	   System.out.println(a);
	 System.out.println("---call frm diff class--");   // call frm diff class                               
	     System.out.println(test6.b);                              //class name .variable name	
   }
   public static void m1()                           // static method                     
   {
	   int c=50;                         //local variable inside method
	   System.out.println(a);
	   System.out.println(c);
   }
     public void m2()                                  //non static method(need to create object
     {
    	 System.out.println(a);
     }
     
     
}

