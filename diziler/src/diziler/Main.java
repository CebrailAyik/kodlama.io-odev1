package diziler;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Ali";
		ogrenciler[1] = "Veli";
		ogrenciler[2] = "Osman";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		double[] myList = { 1.2, 1.5, 4.7, 6.7 };
		double toplam = 0;
		double enBuyuk = myList[0];
		for (double number : myList) {
			if (enBuyuk < number) {
				enBuyuk = number;
			}
			toplam = toplam + number;
			System.out.println(number);

		}
		System.out.println("Toplam = "+ toplam);
		System.out.println("En büyük sayı ="+ enBuyuk);

	}

}
