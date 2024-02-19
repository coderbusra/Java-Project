public class InheritanceDemo {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
		// BaseKrediManager hem Tarımın hem de OgretmenKredisinini annesi olduğu için parantez içerisine new ile ikisinden birinin gönderebiliriz
		
		
	}
}