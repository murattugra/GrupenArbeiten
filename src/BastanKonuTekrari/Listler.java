package BastanKonuTekrari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Listler {

	public static void main(String[] args) {
		
		// List olusturma
		
		List<String> lst=new ArrayList<>();
		
		lst.add("Ali");
		lst.add("Veli");
		System.out.println(lst);
		
		// List olusturma 2. formul
		
		List<Integer> lst2=new ArrayList<>(Arrays.asList(2,3,4,5));
		
		lst2.add(4);
		System.out.println(lst2);
		
		List<Integer> lst3=new ArrayList<>(List.of(3,4,5,6));
		
		lst3.add(8);
		
		// Listin botyutunu bulma
		
		System.out.println(lst3.size());
		
		// isEmpty() listin bos lup olmadigini verir buda bize true yada false
		
		System.out.println(lst3.isEmpty());
		
		List<String> lst4=new ArrayList<>();
		
		System.out.println(lst4.isEmpty());
		
		//get() icine yazdigimiz index teki elemani bize verir
		
		System.out.println(lst3.get(3));
		
		List<String> lst5=new ArrayList<>(Arrays.asList("ALI","vELI"));
		
		System.out.println(lst5.get(1));
		
		
		// remove()   remove(2);  --> 2. indexteki elemani siliyor 
					// remove("Ali"); --> Ali elemaninin siler
		
		
		
		//List<Integer> lst3=new ArrayList<>(List.of(3,4,5,6));
		
		
		lst3.remove(4);
		
		System.out.println(lst3);
		
		lst5.remove("ALI");
		System.out.println(lst5);
		
		System.out.println(lst3.remove(2));
		System.out.println(lst5.remove("ALI"));
		System.out.println(lst5.remove("vELI"));
		
	
		// set() Listin elemaninin degistirme
		
		
		List<Integer> lst6=new ArrayList<>(List.of(3,4,5,6,5,3));
		
		lst6.set(3, 10);
		
		System.out.println(lst6);
		
		List<String> lst7=new ArrayList<>(List.of("3","4","6","3"));
		
		Collections.sort(lst7);// Listin elemanlarini kucukten buyuge siralar ascii degerlerine gore
		System.out.println(lst7);
		//Collections.replaceAll(lst7, "6", "Alti");
		
		Collections.reverse(lst7);
		
		System.out.println(Collections.max(lst7));
		
		//Collections.fill(lst7, "7");
		
		System.out.println(lst7);
		
		
		// contains() bir elemani icerp icermedigini verir  ture yada false verir
		
		System.out.println(lst7.contains("1"));
		
		
		// equals() iki Listin esit olup olmadigini verir
		
		System.out.println(lst7.equals(lst6));
		
		
		List<String> lst8=new ArrayList<>(List.of("3","4","6","3"));
		List<String> lst9=new ArrayList<>(List.of("3","4","6","3"));
		System.out.println(lst8.equals(lst9));
		
		// Arrayi liste cevirme metodu asList();
		
		Integer arr[]= {3,4,6,5};
		
		
		//List<Integer> lst10=Arrays.asList(arr);
		
		List<Integer> lst11=new ArrayList<>();
		
		for (int i : arr) {
			lst11.add(i);
			
		}
		System.out.println(lst11);
		
		
		
		//System.out.println(lst10);
		
	//	String arr2[] = {"Aliye", "Canan"};
     //   List<String> list1 = Arrays.asList(arr2);

		
        
	}

}
