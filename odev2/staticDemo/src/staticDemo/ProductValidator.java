package staticDemo;

public class ProductValidator {
	static { // sahip olduğu static methodu kullanınca newlemeye gerek kalmadan çalışır
		System.out.println("Static yapıcı blok çalıştı");
	}
	public ProductValidator() { // newlenince çalışır
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void bisey() {
		
	}
	
	public static class BaskaBirClass{ //inner class
		public static void sil() {
			
		}
	}
}
