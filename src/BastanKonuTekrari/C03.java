package BastanKonuTekrari;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		// 7-Kullanicidan isim ve soyisimini ayri ayri isteyip
				// girilen ismi asagidaki gibi yazdiriniz
				//
				// girilen isim  : Mehmet Bulutluoz// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isim giriniz");
		String isim=scan.next();
		
		System.out.println("Lutfen soyisim giriniz");
		String soyisim=scan.next();
		
		System.out.println(isim+" "+ soyisim);
		
		scan.close();
	}

}
