package overriding;

public class BaseKrediManager {

	public double hesapla(double tutar) {	// public final double olarak yazınca başka classlarda override edilemez
		return tutar * 1.18;
	}
	
}
