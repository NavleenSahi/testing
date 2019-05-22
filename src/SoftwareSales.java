
public class SoftwareSales {

	
	public double calculatePrice(int quantity) {
			
			double subTotal = 99 * quantity;
			double discount = 0.0;
			
			if (quantity >= 10 && quantity <=19) {
				//20%
				discount = subTotal * 0.20;
			
		} 
		
	else if (quantity >= 19 && quantity <= 49) {
			//30%
		
			 discount = subTotal * 0.30;
		}
		else if (quantity >= 50 && quantity <= 99) {
			//30%
			discount = subTotal * 0.40;
		}
		else if (quantity >= 100) {
			discount = subTotal * 0.50;
		} 
		else if (quantity < 0) {
			return -1;
		}
			
		double finalTotal = subTotal - discount;
		return finalTotal;
	}
}
