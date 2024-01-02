package mini_projeler;

// mükemmel sayı :kendinden başka bölenlerinin sayısının toplamı kendisine eşit olan sayılara denir
// 6 --> 1,2,3 => 1+2+3=6 ise 6 mükemmel sayıdır.
public class mukemmel_sayi {
	
	public static void main (String[] args) {
		int number = 28;
		int total = 0;
		
		for(int i=1;i<number;i++) {
			if(number % i == 0) {
				total = total + i;
			}
		}
		
		if(total== number) {
			System.out.println("Mükemmel sayıdır");
	}else {
		System.out.println("Mükemmel sayı değildir");
	}
}
}
