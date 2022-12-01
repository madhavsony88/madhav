package String_class;

public class sample2_Stringclass_method {
	public static void main(String[] args) {
		String s1="dev";              //declaration/initializatio
		String s2="Ganpati Bappa"; 
		String s3="HARE RAMA";
		String s4="hare rama";
	    String s5=new String("wel come");
	    String s6="WELL COME";
	    String s=new String("Gauravi");
	    System.out.println("----------");
		System.out.println(s2.length());        //length=13
		System.out.println(s3.toLowerCase());
	    System.out.println(s3);
	    System.out.println(s1.toUpperCase());
	    System.out.println("----------");
	    System.out.println(s3.equals(s4));
	    System.out.println(s3.equalsIgnoreCase(s4));
	    System.out.println(s5);
	    String m1="well come";
	    System.out.println(s5==m1);
	    System.out.println(s5.equalsIgnoreCase(m1));
	    System.out.println(s6.equalsIgnoreCase(m1));
	    System.out.println("-------");
	    System.out.println(s3==s);
	    System.out.println("------");
	    System.out.println(s3.equalsIgnoreCase(s));
	}

	}

