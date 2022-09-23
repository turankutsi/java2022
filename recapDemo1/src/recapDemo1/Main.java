package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 244, 
			sayi2 = 25, 
			sayi3 = 26;
		int enBuyuk = sayi1;
		
		if(enBuyuk < sayi2) 
			enBuyuk = sayi2;
		
		if(enBuyuk < sayi3) 
			enBuyuk = sayi3;
		
		
		System.out.println("En buyuk: " + enBuyuk);
		
	}

}
