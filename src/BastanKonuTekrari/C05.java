package BastanKonuTekrari;

import java.util.Scanner;

public class C05 {
				
	public static void main(String[] args) {
		
		// 9- Kullaniciya yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Cemberin yaricapini giriniz");
		
		double yaricap=scan.nextDouble();
		
		double cevre=2*yaricap*3.14;
		
		 double alan=3.14*yaricap*yaricap;
		System.out.println(cevre);
		System.out.println(alan);
	}
}
