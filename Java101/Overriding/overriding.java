public class overriding {
	public static void main (String[] args ) {
		Base_Kredi_Manager[] krediManagers = new Base_Kredi_Manager[] 
				{new Ogretmen_Kredi_Manager(),new Tarım_Kredi_Manager(),new Ogrenci_Kredi_Manager()};
		
	
		for (Base_Kredi_Manager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}
	}
}
