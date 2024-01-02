
public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = " Bugün hava çok güzel. ";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayısı : " + mesaj.length());
		System.out.println("5.eleman : " + mesaj.charAt(4) ); // 4.indisteki karekter
		System.out.println(mesaj.concat(" Yaşasın!")); //concat = birleştirmek 
		System.out.println(mesaj.startsWith("B")); // B harfi ile mi başlıyor true
		System.out.println(mesaj.endsWith("a")); // . ile bitiyor false
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler,0); //0.indisten itibaren 0.indisten 5'e kadar olan harfleri (5.indisi dahil etmeden) yazdır.
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('a')); // belitrilen karakterin mesajın içerisinde kaçıncı karakter olduğunu verir.
		System.out.println(mesaj.lastIndexOf("a")); // sağdan aramaya başladığında ilk a nın indexsini verir.
	
		String yeniMesaj = mesaj.replace(' ' , '-');
		System.out.println(yeniMesaj); // karakter değiştirme
		System.out.println(mesaj.substring(2,5 )); //2. indisten 4. indise kadar (4 dahil değil)
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //kelimelerin hepsini küçük harfe çevirir
		System.out.println(mesaj.toUpperCase()); //kelimelerin hepsini büyük harfe çeviri
		System.out.println(mesaj.trim()); // baştaki ve sonradaki boşlukları siliyor.
	}

}
