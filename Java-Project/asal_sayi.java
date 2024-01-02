package mini_projeler;

public class asal_sayi {

	public static void main(String[] args) {
		int number = 25;
		int remainder = number % 2; // remainder kalan değeri ifade eder
		//System.out.println(remainder);
		boolean isPrime = true; // sayıyı asal kabul ettik
		
		if(number<1){
			System.out.println("Geçersiz sayi");
		}
		
		if (number==1) {
			System.out.println("Sayi asal değildir");
			return;
		}
		
		for (int i=2; i<number; i++ ) {
			if(number % i == 0) {
				isPrime= false;
			}
		}
		if (isPrime) {
			System.out.println("Sayi asladır.");
		}else {
			System.out.println("Sayi asal değildir.");
		}
	}

}
