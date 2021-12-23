package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {

	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, 3, 7, 34, 22, 60, 42, 55));
		//list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz
		
		list.stream().filter(t->t%2==0).forEach(t->System.out.print(t+" "));
		System.out.println();
		//list elemanlarinin  cift olanalrini karelerini ayni satirda aralarina bosluk birakarak yazdiriniz
		
		list.stream().filter(t->t%2==0).map(t->t*t).forEach(t->System.out.print(t+ " "));;
		
		//list elemanlarinin  tek olanalrini 20 den kucuk  olanlari yazdiriniz
		System.out.println();
		list.stream().filter(t->t%2==1 && t<20).forEach(t->System.out.print(t+ " "));
		System.out.println();
		
		
		list.stream().filter(t->t%2==1 && t<20).forEach(Lambda01::printEl);
		System.out.println();
		list.stream().map(t->Math.sqrt(t)).forEach(Lambda01::printEl);
		
	}
	
	public static void printEl(double t) {// refere edilecek method creta edildi
		
		System.out.print(t+ " ");
	}
	
}
