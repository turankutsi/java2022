package odev1;

public class MilitaryCreditManager implements ICreditManager{

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hazırlandı");
	}

	@Override
	public void save() {
		System.out.println("Kaydedildi");
	}

}
