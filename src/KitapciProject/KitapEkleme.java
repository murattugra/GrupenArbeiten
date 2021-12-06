package KitapciProject;

import java.util.Scanner;

public class KitapEkleme {

	
	
	public static void main(String[] args) {
		
		
		kitapekle();
		
		
		
		
			
	}

		public static void kitapekle() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Eklemek istediginiz kitabin adini giriniz");
			Depo.kitapAdi.add(scan.nextLine());
			System.out.println("Eklemek istediginiz kitabin Yazarinin adini giriniz");
			Depo.yazarlar.add(scan.nextLine());
			System.out.println("Eklemek istediginiz kitabin Fiyatini giriniz");
			Depo.fiyatlar.add(scan.nextDouble());
			Depo.kitapNo.add(Depo.count+1000);
			System.out.println("Ekleme isleminiz tamamlanmistir");
			
			
			
			
	}

}
