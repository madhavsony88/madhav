package AccessSpecifiers;

public class sample32 {
	int a;
	sample32(){
		a=1001;
	}
	void a1() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		sample32 s32=new sample32();
		s32.a1();
		System.out.println(s32.a);
	}

}
