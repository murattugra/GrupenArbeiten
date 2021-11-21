package GrupCalismasi04;

public class Soru06 {

	public static void main(String[] args) {
		 /* Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
         * LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40 Beklenen Cikti:
         * Beklenen Cikti: 30 ve 40 icin GCD = 10 30 ve 40 icin LCM = 120
         */
        int sayi1 = 30;
        int sayi2 = 40;
        int gcd = 1;
        int lcm = 1;
        for (int i = 1; i <= 40; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                gcd = i;
            }
            
        }for (int j = 1; j <= 40; j++) {
            if (sayi1%j==0 && sayi2%j==0) {
                lcm*=j;
                sayi1=sayi1/j;
                sayi2=sayi2/j;
            }else {
            
            if (sayi1 % j == 0) {
                lcm*=j;
                sayi1=sayi1/j;  
            }   
            if (sayi2 % j==0) {
                lcm*=j;
                sayi2=sayi2/j;
            }}
                        
            }System.out.println("LCM : " + lcm);
            System.out.println("GCD : " + gcd);
    }

	}


