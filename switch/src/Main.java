
public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'C':
			System.out.println("Orta : Geçtiniz");
			break;
		case 'D':
			System.out.println("Şartlı : Şartlı Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef : Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girişi yaptınız");
		}

	}

}
