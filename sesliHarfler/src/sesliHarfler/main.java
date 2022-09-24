package sesliHarfler;

public class main {

	public static void main(String[] args) {

		char harf = 'O';

		/*
		 * char[] kalınSes = {'A', 'O', 'U', 'I'}; char[] inceSes = {'E', 'Ö', 'Ü',
		 * 'İ'};
		 * 
		 * for (char k:kalınSes) { if(k == harf) System.out.println("Kalın sesli"); }
		 * 
		 * for (char m:inceSes) { if(m == harf) System.out.println("İnce sesli"); }
		 */

		switch (harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalın sesli harf");
				break;
			default:
				System.out.println("İnce sesli harf");
		}

	}

}
