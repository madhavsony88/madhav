package AccessSpecifiers1;

import AccessSpecifiers.sample34;

public class sample42 extends sample34{             //access specifiers call from diff package and class
	public static void main(String[] args) {
		sample42 s42=new sample42();
		s42.q();
		System.out.println(s42.name);
		
	}

}
