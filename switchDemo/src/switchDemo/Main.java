package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'k';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel");
			break;
		case 'B':
			System.out.println("İyi");
			break;
		case 'C':
			System.out.println("Orta");
			break;
		case 'D':
			System.out.println("Kötü");
			break;
		case 'F':
			System.out.println("Fenalık");
			break;
		default:
			System.out.println("Geçersiz Not");
		}

	}

}
