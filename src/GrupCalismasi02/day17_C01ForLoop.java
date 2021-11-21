package GrupCalismasi02;

import java.util.Scanner;

public class day17_C01ForLoop {

	public static void main(String[] args) {
		
		/*
		 Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
			- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
			- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
			- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("100 den kucuk tam sayi giriniz");
	
		double sayi2=scan.nextDouble();
		
		int sayi=(int) sayi2;
		
		
		if (sayi<0||sayi>100) {
			System.out.println("sayi 0 ile 100 arasinda olmalidir");
		} else if(sayi!=sayi2){

			System.out.println("Sayi tam sayi olmalidir");
		}else {
			for (int i = 1; i <=sayi; i++) {
				if (i%3==0&&i%5==0) {
					System.out.println("Java Guzeldir");
				} else if(i%3==0){
					System.out.println("Java");
				}else if(i%5==0) {
					System.out.println("Guzeldir");
				}else {
					System.out.println(i);
				}
			}
			
		}
		
		
		
	}

}
