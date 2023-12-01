//Kullanıcının girdiği sayıya kadar olan asal sayıları ekrana yazdıran program
import java.util.Scanner;

public class Asal_Sayi_Bulma {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi = 0;
		
		System.out.println("Sayı giriniz:");
		sayi=scan.nextInt();
		
		for (int i =2; i<sayi+1 ; i++) {
			int sayac=0;
			for (int j=1; j<sayi+1; j++) {
				if(i%j==0) {
					continue;
				}
				else {
					sayac++;
				}
			}
			if (sayac==sayi-2) {
				System.out.println(i+"Asal sayılar:");
			}	
		}
	}
}
