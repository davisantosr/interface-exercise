package model.services;

public class BrazilTaxServices {
	
	public double tax(Double amount) {
		if (amount <= 100.00) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
		
	}
}
