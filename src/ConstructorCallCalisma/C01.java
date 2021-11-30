package ConstructorCallCalisma;

public class C01 {

	int a=5;
	int b=6;
	static int c=8;
	
	public static void main(String[] args) {
	
		System.out.println(c);
	
		c=10;
		
		C01 c1=new C01();
		
		c1.a=8;
		
		System.out.println(c1.a);
		
		C01 c2=new C01();
		
		System.out.println(c2.a);
		
		System.out.println(c);
		
	
}
}