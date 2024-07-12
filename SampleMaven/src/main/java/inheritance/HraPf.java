package inheritance;

public class HraPf extends BasicpayDedBonus {
	static float hra;
	static float pf;
	
	public float hracalc(int basicpay) {
		hra=0.05f*basicpay;
		return hra;
		
	}
	public float pfcalc(int basicpay) {
		pf=0.2f*basicpay;
		return pf;
		
	}

}
