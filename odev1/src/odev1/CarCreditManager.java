package odev1;

public class CarCreditManager implements ICreditManager {
	
	public void calculate() {
		System.out.println("Araba kredisi hazırlandı");
	}
	
	@Override
	public void save() {
		System.out.println("Kaydedildi");
	}

}
