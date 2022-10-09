package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		DatabaseHelper.Connection.createConnection();
		DatabaseHelper.Crud.update();
		DatabaseHelper.Crud.delete();
	}
}
