package arkadasSayilar;

public class main {

	public static void main(String[] args) {

		// 220 - 284
		// 1184 - 1210
		// 17296 - 18416

		int sayi1 = 17296, sayi2 = 18416;
		int sayi1total = 0, sayi2total = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0)
				sayi1total = sayi1total + i;
		}

		for (int j = 1; j < sayi2; j++) {
			if (sayi2 % j == 0)
				sayi2total = sayi2total + j;
		}

		if (sayi1total == sayi2 && sayi2total == sayi1)
			System.out.println("Sayılar Arkadaştır");
		else
			System.out.println("Sayılar Arkadaş DEĞİLDİR");

	}

}
