package mükemmelSayi;

public class main {

	public static void main(String[] args) {
		
		//6  --> 1,2,3
		//28 --> 1,2,4,7,14
		
		int sayi = 28;
		int sum = 0;
		
		for(int i=1; i<sayi; i++) {
			if(sayi % i == 0)
				sum = sum + i;
		}
		
		if(sum == sayi)
			System.out.println("Mükemmel sayı");
		else
			System.out.println("Mükemmel değil");
	}

}
