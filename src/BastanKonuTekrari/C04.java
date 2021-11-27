package BastanKonuTekrari;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		// Soru 8) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini 
				// ve alanini hesaplayip yazdirin

		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Karenin bir kenar uzunlugunu giriniz");
		
		double kenar=scan.nextDouble();
		
		double cevre= kenar*4;
		
		double alan=kenar*kenar;
		
		System.out.println("Karenin Cevresi : "+cevre);
		System.out.println("Karenin Alani : "+alan);
		scan.close();
	}

}
