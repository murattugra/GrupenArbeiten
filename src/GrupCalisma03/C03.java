package GrupCalisma03;

public class C03 {

	public static void main(String[] args) {
		//22- // kullanicidan 3 basamakli bir sayi alip
        // rakamlar toplamini yazdiran
        // bir program yaziniz
		
		int a=123;
		int toplam=0;
		toplam+=a%10+a/10%10+a/100;
		System.out.println(toplam);
	}

}
