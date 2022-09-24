package miniProjeAsalSayi;

public class main {

	public static void main(String[] args) {
		
		int number = 31;
		int remainder = number % 5;
		//System.out.println(remainder);
		
		/*int counter = 0;
		for (int i=1; i<=number; i++) {
			if(number % i == 0) {
				counter ++;
			}
		}
		
		if(counter <= 2)
			System.out.println("Asaldır");
		else
			System.out.println("Asal değildir");*/
		
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("");
			return;
		}
		
		if(number < 1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		
		for(int i=2; i<number; i++) {
			if(number % i == 0)
				isPrime = false;
		}
		
		if(isPrime)
			System.out.println("Asaldır");
		else
			System.out.println("Asal değildir");
		
	}

}
