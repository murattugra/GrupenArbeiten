package ConstructorCallCalisma;

public class C04 {

	int count;
	static int stCount;

	public C04() {
		count++;
		stCount++;
	}
	
	public int getCount() {
		return count;
	}
	public static int getstCount() {
		return stCount;
	}
	public static void main(String[] args) {
		C04 cs1 = new C04();
		C04 cs2 = new C04();
		C04 cs3 = new C04();
		C04 cs4 = new C04();
		C04 cs5 = new C04();
		C04 cs6 = new C04();
		System.out.println("count is : " + cs6.getCount());
		System.out.println("stcount is : " + cs6.getstCount());
		
		
	}

}
