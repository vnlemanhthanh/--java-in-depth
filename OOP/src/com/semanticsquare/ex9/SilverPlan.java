package com.semanticsquare.ex9;

public class SilverPlan extends HealthInsurancePlan {
	@Override
	public void setCoverage(double coverage) {
		super.setCoverage(coverage * 0.7) ;
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.06 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking); 
	}
}
