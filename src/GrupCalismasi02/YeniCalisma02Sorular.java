package GrupCalismasi02;

import java.util.Scanner;

public class YeniCalisma02Sorular {

	public static void main(String[] args) {
	

		
	/*	1-kullanicinin girdigi cumleyi tersten yazdiriniz.orn: 
			java calisiyorum cikti:muroyisilac avaJ (for,substring)
		2-kullanicinin girdigi cumlenin kac kelimeden olustugunu yazdirin.(for,if,equals,sayac++)
		3-kullanicinin girdigi cumlenin kelimelerini tersten yazdirin, orn: Java calisiyorum. 
		cikti: calisiyorum Java (for, substring)
		4-kullanicinin girdigi cumledeki buyuk harfleri kucuk, kucuk harfleri buyuk sekilde 
		yeniden yazdirin.(for,if-else,substring,toLowerCase,toUpperCase)
	*/	
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen cumle giriniz");
		
		String cumle=scan.nextLine();
		String tersCumle="";
		String Bkharfdegisim="";
		int sayac=0;
		for (int i = cumle.length()-1; i >=0; i--) {
			tersCumle+=cumle.toLowerCase().charAt(i);
			
			if (cumle.charAt(i)==' ') {
				sayac+=1;
			}
			
		}
		for (int i = 0; i <+cumle.length(); i++) {
			char harf=(char) i;
			if (harf>='a' && harf<='z') {
				
			} else {

			}
		}
		System.out.println("Girdiginiz cumlernin Tersi :" +tersCumle);
			
		System.out.println("Girdiginiz Cumle "+(sayac+1)+" kelimedir");

		}
		
		
		
		
	}


