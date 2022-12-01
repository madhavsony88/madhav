package String_class;

public class sample3_StringClass_method {
	public static void main(String[] args) {
		
		String p1="verygood";
		String p2="PQRSTU";
		String p3="My name is sheetal";
		String p4="";
		String p5="qrstuvw";
		String p6="moring ";
		System.out.println("======");
		
	    System.out.println(p1.substring(4));
	    System.out.println(p1.substring(3,5));
	    System.out.println(p1+"  "+p3);             //concat
	    System.out.println(p1.concat(p6));             //addition of two string
	    System.out.println(p3.replace("sheetal", "Gauravi"));
	System.out.println("---------");
	    System.out.println(p3.contains("name"));
	    System.out.println(p1.isEmpty());
	    System.out.println(p4.isEmpty());
	    System.out.println(p2.charAt(3));
	     System.out.println("----");
	    System.out.println(p2.indexOf('S'));
	    System.out.println(p2.indexOf('P'));
	    System.out.println(p6.lastIndexOf('r'));
	    System.out.println("------");
	    System.out.println(p3.startsWith("My"));
	    System.out.println(p3.endsWith("sheetal"));
	
	} 

}
