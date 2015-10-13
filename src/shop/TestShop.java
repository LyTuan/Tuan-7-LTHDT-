package shop;

import java.util.Calendar;
import java.util.Date;

public class TestShop {
	public static void main(String args[]){
		Date date = new Date ();
		Visit v1 = new Visit("Nga",);
		v1.setMemberType("premium");
		v1.setMember(true);
		v1.setProductExpense(200);
		v1.setserviceExpense(100);
		System.out.println(v1.getTotalExpense());
	}
}
