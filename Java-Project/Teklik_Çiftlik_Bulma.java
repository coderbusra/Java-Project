//	Girilen sayı tek mi çift mi ?
import java.util.Scanner;
public class Teklik_Çiftlik_Bulma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0 ;
		int cift_sayi_sayisi = 0;
		int tek_sayi_sayisi = 0;
		System.out.print("Sayı giriniz :");
		
		for(int i = 0; i<10; i++ ) {
			if (a%2==0) {
			System.out.println("Girilen Sayı çiftdir");
			}
			else {
				System.out.println("Girilen sayı tekdir");
			}
		}
		System.out.println(tek_sayi_sayisi + "Tek sayı sayısı");
		System.out.println(cift_sayi_sayisi + "Çift sayı sayısı");
	}
}
