package shop;

public class DiscountRate {
	private double serviceDiscountPremium=0.2;
	private double serviceDiscountGold=0.15;
	private double serviceDiscontSilver=0.1;
	private double productDiscountPremium=0.1;
	private double productDiscountGold=0.1;
	private double productDiscountSilver=0.1;
	public double getServiceDiscountRate(String type){
		if(type.equals("premium")){
			return serviceDiscountPremium;
		}else if(type.equals("gold")){
			return serviceDiscountGold;
		}else if(type.equals("silver")){
			return serviceDiscontSilver;
		}else{
			return 0;
		}
		
	}
	public double getProductDiscountRate(String type){
		if(type.equals("premium")){
			return productDiscountPremium;
		}else if(type.equals("gold")){
			return productDiscountGold;
		}else if(type.equals("silver")){
			return productDiscountSilver;
		}else{
			return 0;
		}
	}
}
