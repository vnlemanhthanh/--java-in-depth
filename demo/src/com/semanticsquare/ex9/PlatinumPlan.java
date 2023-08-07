package com.semanticsquare.ex9;

public class PlatinumPlan extends HealthInsurancePlan {

	@Override
	public void setCoverage(double coverage) {
		super.setCoverage(coverage * 0.9) ;
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.08 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}

}
