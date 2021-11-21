package GrupCalismasi02;

import java.util.Scanner;

public class SifreSorusuZor {

	public static void main(String[] args) {
		/*
        Soru 5 ) Kullanicidan bir sifre girmesini isteyin. 
        Girilen sifreyi asagidaki sartlara gore kontrol edin 
        ve sifredeki hatalari yazdirin.
       Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin 
       ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
       - Sifre kucuk harf icermelidir
       - Sifre buyuk harf icermelidir
       - Sifre ozel karakter icermelidir
       - Sifre en az 8 karakter olmalidir.
        */
        
        
        
        Scanner scan = new Scanner(System.in);
        
        String sifre ="";
        
        int buyuk=0;    // methodlardan donecek degerler baslangicta 0 aldik, eger sart saglanirsa 1 olacak 
        int kucuk=0;    // ve toplamlari 4 olunce tum sartlar saglanmis olacak.
        int ozel=0;     //do while dongusunden once variable lari olusturduk.
        int uzunluk=0;
        int toplam=0;
        
        do {
            
            System.out.println("Lutfen sifrenizi giriniz:");
            sifre=scan.nextLine();
            
            buyuk=buyukKontrol(sifre);              // bu methodlar cagirildiginda dogruysa 1, degilse 0 degerini int. olarak atayacak.
            kucuk=kucukKontrol(sifre);              // dolayisiyla hepsi istenilen sartlari sagladiginda toplamlari 4 olacak ve dongu sona erecek.
            ozel=ozelKontrol(sifre);                // ozel(sifre) dedigimde asagidan 1 gelirse eger, int ozel=1; olacak ornegin.
            uzunluk=uzunlukKontrol(sifre);          // buyuk kucuk ozel ve uzunluk variablelari donguden once olusturulan integer data turunde konteynerlar.
            
            toplam= buyuk+kucuk+ozel+uzunluk; //tum methodlardan 1 gelirse toplam 4 olacak ve sart larin hepsi saglanmis olacak.
            
            
            
        } while (toplam!=4); // toplam 4 e esit olana kadar dongu devam edip kullaniciya uyari verecek.
                            // kafamizi daha cok karistiran kisim burasiydi, buradaki degeri boolean degil integer yapinca daha kolay anlasiliyor sanki.
        
                System.out.println("Sifreniz basarili sekilde kaydedildi");  //while dongu sarti saglaninca yani toplam 4 e esit olunca dongu kirildi ve bu satir yazdirildi.
                System.out.println("Sifreniz:--->  "+ sifre+"  <---lutfen kaydedin.");
        
        scan.close();
        
        
        
    }//main sonu
    private static int uzunlukKontrol(String str) {
        int sayi=0; //baslangicta method icine sifir degere sahip, ama method icinde alt satirlarda sart saglanirsa 1 degeri atanacak, ve methodun cagrildigi yere dondurecek.
        
        if (str.length()>=8) {
            sayi=1;
        } else {
            
            System.out.println("Sifreniz en az 8 karakter icermelidir.");
        }
        
        
        
        return sayi;// Cagrildigi yere  0 veya 1 integer degerini dondurecek, sart saglanmissa 1 degeri, saglanmamissa 0 degerini dondurecek.
    }
    private static int ozelKontrol(String str) {
        int sayi =0; //baslangicta method icine sifir degere sahip, ama method icinde alt satirlarda sart saglanirsa 1 degeri atanacak, ve methodun cagrildigi yere dondurecek.
        String ozelKrk ="!\"#$%&'()*+,-. /:;<=>?@[]^_`{|}~";
        for (int i = 0; i < str.length(); i++) {
            
            if (ozelKrk.contains(str.substring(i, i+1))) {
                sayi=1;
                break;
            } 
            
        } 
        if (sayi==0) {
            System.out.println("Sifreniz en az bir tane ozel karakter icermelidir.");
        }
        
        
        
        return sayi;// Cagrildigi yere  0 veya 1 integer degerini dondurecek, sart saglanmissa 1 degeri, saglanmamissa 0 degerini dondurecek.
        
        
    
    }
    private static int buyukKontrol(String str) {
        int sayi =0; //baslangicta method icine sifir degere sahip, ama method icinde alt satirlarda sart saglanirsa 1 degeri atanacak, ve methodun cagrildigi yere dondurecek.
        String buyukHarfler ="ABCDEFGHIJKLMNOPRSTUVYZWQX";
        for (int i = 0; i < str.length(); i++) {
            
            if (buyukHarfler.contains(str.substring(i, i+1))) {
                sayi=1;
                break;
            } 
            
        } 
        if (sayi==0) {
            System.out.println("Sifreniz en az bir tane BUYUK harf icermelidir.");
        }
        
        
        
        return sayi;// Cagrildigi yere  0 veya 1 integer degerini dondurecek, sart saglanmissa 1 degeri, saglanmamissa 0 degerini dondurecek.
        
        
        
    }
    private static int kucukKontrol(String str) {
        int sayi =0; //baslangicta method icine sifir degere sahip, ama method icinde alt satirlarda sart saglanirsa 1 degeri atanacak, ve methodun cagrildigi yere dondurecek.
        String kucukHarfler ="abcdefghijklmnoprstuvyzqwx";
        for (int i = 0; i < str.length(); i++) {
            
            if (kucukHarfler.contains(str.substring(i, i+1))) {
                sayi=1;
                break;
            } 
            
        } 
        if (sayi==0) {
            System.out.println("Sifreniz en az bir tane kucuk harf icermelidir.");
        }
        
        
        
        return sayi;// Cagrildigi yere  0 veya 1 integer degerini dondurecek, sart saglanmissa 1 degeri, saglanmamissa 0 degerini dondurecek.
    }
    
    
    
// class sonu

}

