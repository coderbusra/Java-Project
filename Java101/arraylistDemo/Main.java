package arraylistDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();
		System.out.println(sayilar.size());
		
		sayilar.add(1);
		sayilar.add(10);
		sayilar.add("Ankara");
		//System.out.println(sayilar.size());
		//System.out.println(sayilar.get(0));
		//sayilar.set(0,100);
		//System.out.println(sayilar.get(2));
		
		//System.out.println(sayilar.get(0));
		
		//sayilar.remove(0); //silme
		//System.out.println(sayilar.get(0));
		
		for (Object i:sayilar) {
			System.out.println(i);
		}
	}
	

}
