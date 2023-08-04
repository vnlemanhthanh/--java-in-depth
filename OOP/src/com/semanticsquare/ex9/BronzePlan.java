package com.semanticsquare.ex9;

public class BronzePlan extends HealthInsurancePlan {
	@Override
	public void setCoverage(double coverage) {
		super.setCoverage(coverage * 0.6) ;
	}
	
	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.05 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking); 
	}
}
