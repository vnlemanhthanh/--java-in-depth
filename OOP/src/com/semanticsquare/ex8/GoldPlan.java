package com.semanticsquare.ex8;

public class GoldPlan extends HealthInsurancePlan {
	@Override
	public void setCoverage(double coverage) {
		super.setCoverage(coverage * 0.8);
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		return 0.07 * salary;
	}
}
