package GrupArrayList;

import java.util.ArrayList;
import java.util.List;

public class List_02 {

	public static void main(String[] args) {

		/*
		 * Kullanıcıdan girdi olarak bir Dize almak için bir Java programı yazın ve bu
		 * dizede oluşan maksimum karakteri bulun. (Büyük/küçük harf duyarlılığını
		 * yoksay) giriş: * Java öğrenmek kolaydır * çıktı: * oluşan maksimum karakter:
		 * a
		 */

		/*
		 * Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string. (Ignore case sensitivity) input :
		 * Learning java is easy output: maximum occurring character is : a
		 * 
		 */

		String cumle = "Learning java is easy";

		String arr1[] = cumle.split("");

		int sayac = 0;
		int max = 0;
		String bos = "";

		for (int i = 0; i < arr1.length; i++) {

			for (int j = i; j < arr1.length; j++) {

				if (arr1[i].equals(arr1[j])) {
					sayac++;
				}
			}
			if (sayac > max) {
				max = sayac;
				bos = arr1[i] + "=" + sayac;

			}
			sayac = 0;
		}

		System.out.println(bos);

	}
}