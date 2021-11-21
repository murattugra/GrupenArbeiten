package GrupCalismasi02;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		//Soru 5) Kullanicidan 100’den kucuk pozitif bir tamsayi isteyin. 
		//	1’den baslayarak girilen sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("100 den kucuk bir ta sayi giriniz");
		
		double sayi2=scan.nextDouble();
		int sayi=(int) sayi2;
		
		if (sayi<0||sayi>100) {
			System.out.println("Sayi 0 ile 100 arasinda olmalidir");
		} else if(sayi!=sayi2){
			System.out.println("Lutfen tam sayi giriniz");
		}else {
			for (int i = 1; i <sayi ; i++) {
				if (i%3==0||i%5==0) {
					System.out.println(i);
				} 
			
			}
		}
	}

}
