package KitapciProject;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalistirmaClassi {

	static int secim = 0;

	public static void main(String[] args) {

		do {

			menu(secim);

			switch (secim) {

			case 1:

				KitapEkleme.main(args);
				break;

			case 2:
				int index;
				Scanner scan = new Scanner(System.in);
				System.out.println("Goruntulemek istediginiz kitabin numarasini giriniz");
				index = scan.nextInt() - (1000);

				if (index > Depo.kitapNo.size() - 1) {
					System.out.println("Girmis oldugunuz numarada kitap bulunmamaktadir");
					break;
				}
				System.out.println("Kitap No  : " + Depo.kitapNo.get(index));
				System.out.println("Kitap Adi : " + Depo.kitapAdi.get(index));
				System.out.println("Kitap Yazari : " + Depo.yazarlar.get(index));
				System.out.println("Kitap Fiyati : " + Depo.fiyatlar.get(index) + " TL");
				break;

			case 3:
				String kitapAdi = "";
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Goruntulemek istediginiz kitabin adini giriniz");
				kitapAdi = scan1.nextLine();
				boolean a = false;
				for (int i = 0; i < Depo.kitapAdi.size(); i++) {
					if (kitapAdi.equalsIgnoreCase(Depo.kitapAdi.get(i))) {
						System.out.println("Kitap No  : " + Depo.kitapNo.get(i));
						System.out.println("Kitap Adi : " + Depo.kitapAdi.get(i));
						System.out.println("Kitap Yazari : " + Depo.yazarlar.get(i));
						System.out.println("Kitap Fiyati : " + Depo.fiyatlar.get(i) + " TL");
						a = true;
						break;
					}
				}
				if (a == false) {
					System.out.println("Aradiginiz kitap mevcut degildir");
				}
				break;
			case 4:
				int no;
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Lutfen silmek istediginiz kitabin numarasini giriniz");
				no = scan2.nextInt();
				boolean b = false;
				for (int i = 0; i < Depo.kitapNo.size(); i++) {
					if (no==Depo.kitapNo.get(i)) {
						Depo.kitapAdi.set(i, "Silindi");
						Depo.yazarlar.set(i,"Silindi");
						Depo.fiyatlar.set(i, 0.0);
						b=true;
						break;
					}
				
				}
				if (b == false) {
					System.out.println("Girdiginiz numarada kitap mevcut degildir");
				}
				break;
			case 5:
				for (int i = 0; i < Depo.kitapAdi.size(); i++) {
					System.out.println("Kitap No  : " + Depo.kitapNo.get(i));
					System.out.println("Kitap Adi : " + Depo.kitapAdi.get(i));
					System.out.println("Kitap Yazari : " + Depo.yazarlar.get(i));
					System.out.println("Kitap Fiyati : " + Depo.fiyatlar.get(i) + " TL");
					System.out.println();
				}
				LocalDateTime tarihSaat = LocalDateTime.now();
				DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("d / MM / YYYY EEEE  h : mm   a");
				System.out.println(duzenle.format(tarihSaat)+" Itibariyle guncel Kitap Listemiz");
			}

		} while (secim != 6);
		System.out.println("Tesekkurler islem solandiriliyor.....");

	}

	public static int menu(int secim2) {
		System.out.println("*******BugBuster Kitapcisina Hosgeldiniz********");
		System.out.println("***Yapmak istediginiz islemin Numarasini giriniz***");
		Scanner scan = new Scanner(System.in);
		System.out.println("1-kitap ekle");
		System.out.println("2-numara ile kitap goruntule");
		System.out.println("3-bilgi ile kitap goruntule");
		System.out.println("4-numara ile kitap sil");
		System.out.println("5-tum kitaplari listele");
		System.out.println("6-cikis");
		return secim = scan.nextInt();

	}

}
