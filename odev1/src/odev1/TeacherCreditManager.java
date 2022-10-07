package odev1;

public class TeacherCreditManager implements ICreditManager{

	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hazırlandı");
	}

	@Override
	public void save() {
		System.out.println("Kaydedildi");
	}

}
