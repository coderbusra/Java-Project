public class Ogrenci_Kredi_Manager extends Base_Kredi_Manager {
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
	//Base_Kredi_Manager'ın hesaplasını öğrenci için ezdik. Overiding özelliği
}
