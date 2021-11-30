package ArrayListReplit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru01 {

	public static void main(String[] args) {
		/*	10 elemanlı bir liste oluşturun. 8. öğeyi 3. öğeyle değiştirin.

		GİRİŞ : Dizgi[] isimler={"Ümit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

		Çıktı:

		[Ümit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
		*/
		
		String arr[]={"Ümit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

		
		List<String> lst=Arrays.asList(arr);
		System.out.println(lst);
		String str=lst.get(2);
		String str2=lst.get(7);
	
		lst.set(7, str);
		lst.set(2, str2);
		System.out.println(lst);
	}

}
