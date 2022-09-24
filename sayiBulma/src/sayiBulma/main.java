package sayiBulma;

public class main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;

		/*
		 * for (int i:sayilar) { if(i == aranacak) { System.out.println("BULDUM");
		 * break; } else { System.out.println("Bulamadım"); } }
		 */

		boolean varMi = false;
		for (int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi)
			System.out.println("Sayı mevcuttur");
		else
			System.out.println("Sayı mevcut değildir");

	}

}
