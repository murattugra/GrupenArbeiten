package TekrarCalismasi;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
	
		//Soru 4) Kullanicidan iki sayi isteyin, 
	   //sayilarin ikisi de pozitif ise sayilarin toplamini 
		//yazdirin, 
		//sayilarin ikisi de negative ise sayilarin 
		//carpimini yazdirin, sayilarin ikisi farkli 
		//isaretlere sahipse 
		//�farkli isaretlerde sayilarla islem 
	  //	yapamazsin� yazdirin,
		//sayilardan sifira esit olan varsa �sifir 
	  //	carpmaya gore yutan elemandir� yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		if (sayi1>0 && sayi2>0) {
			System.out.println("Toplam :"+(sayi1+sayi2));
		} else if(sayi1<0 && sayi2<0) {
			System.out.println("Capmasi :"+(sayi1*sayi2));
		}else if(){
			
		}else if(sayi1==0 || sayi2==0) {
		}
			System.out.println("0 ile carpma yapilmaz");
		}else {
			System.out.println("gecersiz karakter");
		}
		
		
		
	}

}
