package KonuTekrarlari;

import java.util.Arrays;
import java.util.Scanner;

public class MethoCreation1 {

	public static void main(String[] args) {

		// Soru 5) Kullaniciya kac sayi toplamak istedigini sorun.

		// Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini

		// isteyin ve sayilarin toplamini yazdirin. Kullanici toplamak istedigi sayi
		// adedini

		// 4'den buyuk girerse �Cok sayi girdiniz, ben toplayamam yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Kac sayi toplamak istiyorunuz");
		int adet = scan.nextInt();

		if (adet > 4) {
			System.out.println("Cok sayi girdiniz, ben toplayamam");
		} else {
			int arr[] = new int[adet];
			for (int i = 0; i < adet; i++) {
				System.out.println(i + 1 + ". sayiyi giriniz");
				arr[i] = scan.nextInt();

			}
			toplam(arr);
scan.close();
		}

	}

	private static void toplam(int[] arr) {
		int toplam = 0;
		for (int i : arr) {
			toplam += i;
		}
		System.out.println("Sayilarin Tolami : "+toplam);
	}

}
