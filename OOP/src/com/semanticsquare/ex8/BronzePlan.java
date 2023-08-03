package com.semanticsquare.ex8;

public class BronzePlan extends HealthInsurancePlan {
	@Override
	public void setCoverage(double coverage) {
		super.setCoverage(coverage * 0.6) ;
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		return 0.05 * salary;
	}
}
