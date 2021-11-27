package BastanKonuTekrari;

public class C14 {

	public static void main(String[] args) {
		int sayi1=15;
		int sayi2=20;
		
		//baslangicta sayi1=10 sayi2=30
		
		System.out.println("sayi1:"+ sayi1 +" " + "sayi2:" + sayi2);	
			
		sayi1=sayi1+sayi2;	//ucuncu bir variable kullanmayacaksak,verilen iki sayinin farkindan ve toplamindan istiafde ederiz
			//burasi  35
		sayi2=sayi2-sayi1; //Javada islem sirasi vardir ve sayi1 degeri yukarsa 35 olur,burdaki sayi1 i 35 alir
		
		System.out.println(sayi1 + sayi2);
		
		System.out.println("enson sayi1="+  sayi1 + "ve sayi2="  + sayi2 );


	}

}
