package odev1;

public class CustomerManager {

	private Customer customer;
	private ICreditManager IcreditManager;
	
	public CustomerManager(Customer customer, ICreditManager IcreditManager) {
		this.customer = customer;
		this.IcreditManager = IcreditManager;
	}
	
	public void save() {
		System.out.println("Müşteri Kaydedildi " );
	}
	
	public void delete() {
		System.out.println("Müşteri Silindi " );
	}
	
	public void giveCredit() {
		IcreditManager.calculate();
		System.out.println("Kredi verildi");
	}
	
	/*public void save(int id, String firstName, String lastName, String nationalIdentity) {
		System.out.println("Müşteri Kaydedildi");
	}*/
	
}
