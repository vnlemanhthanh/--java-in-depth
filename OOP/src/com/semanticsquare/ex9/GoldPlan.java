package com.semanticsquare.ex9;

public class GoldPlan extends HealthInsurancePlan {
	@Override
	public void setCoverage(double coverage) {
		super.setCoverage(coverage * 0.8);
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.07 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking); 
	}
}
