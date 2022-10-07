package odev1;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
		
		/*CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer();
		customer.setId(1);
		
		CustomerManager customerManager = new CustomerManager(customer);
		//customerManager.save(1, "Kutsi", "Türan", "12121212121212");
		customerManager.save(); 
		customerManager.delete();
		
		Company company = new Company();
		company.setTaxNumber("1000000");
		company.setCompanyName("Arçelik");
		company.setId(100);
		
		CustomerManager customerManager2 = new CustomerManager(new Person());
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		
		Person person = new Person();*/
		
		
	}

}
