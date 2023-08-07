package com.semanticsquare.ex8;

public class PlatinumPlan extends HealthInsurancePlan {

	@Override
	public void setCoverage(double coverage) {
		super.setCoverage(coverage * 0.9) ;
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		return 0.08 * salary;
	}

}
