package ConstructorCallCalisma;

public class C05 {

	static int y;
	int x;
	
	C05(int i){
		x+=i;
		y+=i;
		
	}
	
	public static void main(String[] args) {

		new C05(2);
		C05 dnm=new C05(3);
		System.out.println(dnm.x + "," +dnm.y);
	}
}