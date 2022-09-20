
public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[2][2];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Yozgat";
		for(int i = 0; i<2; i++) {
			System.out.println("------");
			for(int j = 0; j<2;j++) {
				System.out.println(sehirler[i][j]);
				
			}
		}

	}

}
