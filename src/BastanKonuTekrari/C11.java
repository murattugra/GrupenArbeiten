package BastanKonuTekrari;

import java.util.Scanner;

public class C11 {



	public static void main(String[] args) {

		/*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yazdizmak istediginiz gunun bas harfini yazdiriniz");
		char basharf=scan.next().toUpperCase().charAt(0);
		
		

				switch(basharf){
				
				case 'P':
					System.out.println("Pazartesi , Persembe ,Pazar");
					break;
					
				case 'S':
					System.out.println("Sali");
					break;
					
				case 'C':
					System.out.println("Carsamba, ,Cuma, Cumartesi");
					break;
					
					default:
						System.out.println("Lutfen gecerli bir harf girin");
				

	
		}
	}
}

