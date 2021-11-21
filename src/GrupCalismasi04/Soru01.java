package GrupCalismasi04;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		
	/*	* Problem tanımı : Bir String içerisindeki tüm karakterleri en fazla bir kez
		* yazdıran parametreli bir method yazınız. Test Data: input:
		* "aabbcccccddddaaa" output: abcd
		*/
		String cumle="aabbccccdddaaa";
		
		tekrar(cumle);
	
	}

	private static void tekrar(String cumle) {

		birKereYazdir("aabbccccdddaaa");

   }

    public static void birKereYazdir(String str) {

        String sonuc = "";  //string default değeri "" atadık çünkü işleme etki etmemeli.
        for (int i = 0; i < str.length(); i++) {
            if (!sonuc.contains(str.substring(i, i + 1))) {//sonuç metni str'nin

                sonuc += str.substring(i, i + 1);
            }
        }

        System.out.println(sonuc);
}

}
