package GrupArrayList;

import java.util.ArrayList;
import java.util.List;

public class List_01 {

	public static void main(String[] args) {
	/*	10 elemanlı bir liste oluşturun. 8. öğeyi 3. öğeyle değiştirin.

		GİRİŞ : Dizgi[] isimler={"Ümit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

		Çıktı:

		[Ümit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]*/
		
		String arr[]= {"Ümit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
		
		List<String> lst=new ArrayList<>();
		for (String i : arr) {
		lst.add(i);
		}
		System.out.println(lst);
		List<String> degistirme=new ArrayList<>();
		degistirme.add(lst.get(3));
		degistirme.add(lst.get(8));
		lst.set(3, degistirme.get(1));
		lst.set(8, degistirme.get(0));
		System.out.println(lst);
	}

}
