package ConstructorCallCalisma;

public class C03 {

	int d=3;
	static int t=7;
		
	public static void main(String[] args) {
		
		int c=t;
	
		C03 deney=new C03();
	System.out.println(deney.d);
		deney.statikOlmayan();
		int q=deney.d;
		
		add();
	}

	private static void add() {
	C03 concat=new C03();
	concat.statikOlmayan();
	
	}

	public void statikOlmayan() {
	
		
		add();
	}
}
