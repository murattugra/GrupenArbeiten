package GrupCalismasi04;

import java.util.Scanner;

public class Soru05 {

	public static void main(String[] args) {
		// 4-kullanicinin girdigi cumledeki buyuk harfleri kucuk, kucuk harfleri buyuk sekilde 
		//yeniden yazdirin.(for,if-else,substring,toLowerCase,toUpperCase)

		
		Scanner scan=new Scanner(System.in);
		System.out.println("cumle yaziniz");
		String cumle=scan.nextLine();
		
		String bkdegisim="";
		
		for (int i = 0; i <=cumle.length()-1; i++) {
			if (cumle.charAt(i)>='A'&&cumle.charAt(i)<='Z') {
				bkdegisim+=cumle.substring(i, i+1).toLowerCase();
			} else if(cumle.charAt(i)>='a'&&cumle.charAt(i)<='z'){
				bkdegisim+=cumle.substring(i, i+1).toUpperCase();
			}else {
				bkdegisim+=cumle.charAt(i);
			}
		}
		System.out.println(bkdegisim);
		
	}

}
