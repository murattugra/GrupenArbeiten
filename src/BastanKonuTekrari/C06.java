package BastanKonuTekrari;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		// Soru 10) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve
        // yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("uzunluk giriniz");
		
		double uzunluk=scan.nextDouble();
		
		System.out.println("kisa kenar giriniz");
		
		double kisakenar=scan.nextDouble();
		
		System.out.println("yukseklik giriniz");
		
		double yukseklik=scan.nextDouble();
		
		
		System.out.println("Dikdortgenin hacmi : "+uzunluk*kisakenar*yukseklik);
		
		
		
		
		
	}

}
