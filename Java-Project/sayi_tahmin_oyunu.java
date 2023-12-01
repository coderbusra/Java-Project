package java_project ;

import java.util.Random;
import java.util.Scanner;

public class sayi_tahmin_oyunu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		char devam  = 'e';
		
		int rekor = Integer.MAX_VALUE;
		
		do {
		int rastgeleSayi = random.nextInt(1000)+1;
		int tahminSayi = 0;
		boolean sayiBulundu = false;
		
		System.out.println("1 ile 1000 arasında sayi tuttum tahmin et!");
		
		while(! sayiBulundu) {
			System.out.println("Tahmininiz: ");
			int tahmin = scanner.nextInt();
			tahminSayi++;
		
		
		if(tahmin<rastgeleSayi) {
			System.out.println("Daha büyük bir sayi girmelisiniz");
		}else if(tahmin>rastgeleSayi){
			System.out.println("Daha küçük bir sayi giriniz");
		}else {
			sayiBulundu=true;
			System.out.println("Tebrikler sayiyi buldunuz");
			System.out.println("Tahmin sayisi : "+tahminSayi);
			
			if (tahminSayi<rekor) {
				rekor = tahminSayi;
				System.out.println("Tebrikler yeni rekoru kırdınız");
				}
			}
		}
		System.out.println("Tekrar oynamak istermisiniz? (e=Evet)");
		devam = scanner.next().charAt(0);
	} while (devam == 'e');
		System.out.println("Oyunu kapattınız iyi günler");
	}
}