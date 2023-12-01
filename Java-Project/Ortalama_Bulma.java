//kullanıcı tarafından girilen 10 sayının ortalamasını hesaplamak.
import java.util.Scanner;

public class Ortalama_Bulma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		int a, toplam =0;
		System.out.println("Girmek istediğiniz sayıyı giriniz");
		
		for(int i = 0; i< 10; i++) {
			System.out.print((i+1) + ".sayiyi giriniz: ");
			a = scan. nextInt();
			toplam += a;
		}  
		System.out.println("Sayilarin ortalaması = " + ((float)toplam/10));
	}
}
