package GrupCalismasi04;

import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateTime {

	public static void main(String[] args) {
	
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen dogum tarihinizi giriniz.");
	    LocalDate dogumTarihi4=LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
		System.out.println(dogumTarihi4);
		
		
		

	}

}
