package GrupCalismasi02;

import java.util.Scanner;

public class day17_C02_ForLoop {

	public static void main(String[] args) {
		
	// Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
	
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir kelime yada cumle yaziniz");
		
		String kelime=scan.nextLine();
		
		for (int i = kelime.length()-1; i >=0; i--) {
							//	8  
		//	Seyfullah			7
							//	6
								
			System.out.print(kelime.substring(i,i+1)); // 8. INDEX h HARFI ILKINDE
											 //7, 8		// 7.  INDEX a HARFI
											 //6, 7		// 6. index l harfi
			/*String ters="";
			
			ters=kelime.substring(i, i+1);
			
			System.out.print(ters);
			*/
		}
	
	}

}
