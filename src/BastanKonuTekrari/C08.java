package BastanKonuTekrari;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		
		// Soru 13) Kullanicidan ismini alip isminin bas harfini yazdirin.
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("isim giriniz");
		String isim=scan.next();
		
		char basharf=isim.charAt(0);
		
		System.out.println("Isminizin bas harfi :"+basharf);
		
		
	}

}
