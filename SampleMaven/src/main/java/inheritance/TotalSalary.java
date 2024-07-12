package inheritance;


public class TotalSalary extends HraPf{
	public static float total(int ba,int de,int bo,float hr,float pf) {
		float total=ba-de+bo+hr-pf;
		return total;
	}
	public static void salaryslip(int a,int b,float c,float d,int e,float f) {
		System.out.println("SALARY SLIP---");
		System.out.println("Basic Pay: "+a);
		System.out.println("Deductions: "+b);
		System.out.println("HRA: "+c);
		System.out.println("PF: "+d);
		System.out.println("Bonus: "+e);
		System.out.println("Total Salary: "+f);
	}

	public static void main(String[] args) {
		BasicpayDedBonus obj5=new BasicpayDedBonus();
		obj5.userinput();
		HraPf obj6=new HraPf();
		float hrahere=obj6.hracalc(obj5.basicpay);
		//System.out.println("hra:"+hrahere);
		float pfhere=obj6.pfcalc(obj5.basicpay);
		//System.out.println("pf:"+pfhere);
		float totalsalary=TotalSalary.total(obj5.basicpay,obj5.ded,obj5.bonus,hrahere,pfhere);
		//System.out.println("total salary:"+totalsalary);
		TotalSalary.salaryslip(obj5.basicpay,obj5.ded,hrahere,pfhere,obj5.bonus,totalsalary);
		
		
	}
}
