package com.semanticsquare.ex8;

public class SilverPlan extends HealthInsurancePlan {
	@Override
	public void setCoverage(double coverage) {
		super.setCoverage(coverage * 0.7) ;
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		return 0.06 * salary;
	}
}
