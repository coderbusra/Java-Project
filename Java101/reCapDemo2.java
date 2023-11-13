
public class reCapDemo2 {

	public static void main(String[] args) {
		
		// double[] myList = new double[4]; diğer türlü yazımı alt satırda.
		double[] myList = {7.9,1.4,3.7,4.5};
		double total = 0;
		double max = myList[0];
		for (double number:myList) {
			if (max<number) {
				max = number;
			}
			
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En Büyük = " + max);
	}

}
