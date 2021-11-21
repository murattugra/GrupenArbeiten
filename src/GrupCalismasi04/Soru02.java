package GrupCalismasi04;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
	
	/*	1-kullanicinin girdigi cumleyi tersten yazdiriniz.orn: java calisiyorum cikti:muroyisilac avaJ (for,substring)
		2-kullanicinin girdigi cumlenin kac kelimeden olustugunu yazdirin.(for,if,equals,sayac++)
		3-kullanicinin girdigi cumlenin kelimelerini tersten yazdirin, orn: Java calisiyorum.  
		cikti: calisiyorum Java (for, substring)
		4-kullanicinin girdigi cumledeki buyuk harfleri kucuk, kucuk harfleri buyuk sekilde 
		yeniden yazdirin.(for,if-else,substring,toLowerCase,toUpperCase)
   */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("cumle giriniz");
		
		String cumle=scan.nextLine();
		
		
		String ters="";
		
		for (int i = cumle.length()-1; i >=0; i--) {
			ters+=cumle.charAt(i);
		}
		System.out.println(ters);
		
	
	}

}
