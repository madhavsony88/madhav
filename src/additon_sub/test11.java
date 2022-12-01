package additon_sub;

public class test11 {
	public static void main(String[]args)
	{
		vlgeinfo("latur",3000,100,1500,1500);
		test11 t11=new test11();
		t11.Districtinfo("latur", 7, 200000, "Renapur");
			
	}
	public static void vlgeinfo(String vname,int population,int houses,int male,int female)
	{
		System.out.println(vname+" "+population+" "+houses+" "+male+" "+female);
	}
	public void Districtinfo(String dname,int tq,int popu,String tqname) 
	{
		System.out.println(dname+" "+tq+" "+popu+" "+tqname);
	}
	

	}

