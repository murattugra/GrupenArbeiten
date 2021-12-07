package TekrarCalismasi;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
	
		// Soru 5) Kullanicidan 100 uzerinden notunu 
		//isteyin. 
		        //          Not u harf sistemine cevirip 
	//	yazdirin. 
		        //          50 den kucukse  D , 
		        //          50 ye esit ve buyuk  ve 60 dan 
	//	kucuk ise  C , 
		        //          60 a esit ve buyuk  ve 80 dan 
	//	kucuk ise  B , 
		        //          80 ve uzerinde ise  A

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yuz uzerinden Not giriniz");
		int not=scan.nextInt();
		
		if (not>=0&&not<50) {
			System.out.println("D");
		} else if(not>=50&&not<60){
			System.out.println("C");
		}else if(not>+60&&not<80) {
			System.out.println("B");
			
		}else if(not>=80 && not<=100){
			System.out.println("A");
			
		}else {
			System.out.println("Gecerli not not giriniz");
		}
		
		
		
		
		
	}

}
