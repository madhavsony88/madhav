package control_statement;

public class examp_if_else {
public static void main(String[] args) {
	      int marks=25;
	      if(marks>=65)
	      {
	    	  System.out.println("std in didtinction");
	      }
	      
	      else if(marks>=60 & marks<=64)
	      {
	    	  System.out.println("std in first class");
	      }
	      else if(marks>=50 & marks<=59)
	      {
	      System.out.println("std in second class");
	      }
	      else if(marks>=35& marks<=49)
	      {
	    	  System.out.println("std is pass");
	      }
	      else
	      {
	    	  System.out.println("std is fail");
	      }
}
}
