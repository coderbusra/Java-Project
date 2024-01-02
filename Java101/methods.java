
public class methods {

	public static void main(String[] args) {
		sayiBulma();
		sayiBulma();
		sayiBulma();
	}
	
	public static void sayiBulma() {
		int sayilar[] = new int[] {1,2,5,7,9,0}; 
		int aranacak = 6;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			mesajVer(aranacak);
		}else {
			System.out.println("Sayi mevcut değildir: " + aranacak );
		}
	}
	
	public static void mesajVer(int aranacak) {
		System.out.println("Sayı mevcuttur : " + aranacak);
	}
}
