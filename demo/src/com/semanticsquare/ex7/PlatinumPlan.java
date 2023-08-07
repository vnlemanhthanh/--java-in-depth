package com.semanticsquare.ex7;

public class PlatinumPlan extends HealthInsurancePlan {

	@Override
	public void setCoverage(double coverage) {
		super.setCoverage(coverage * 0.9) ;
	}

}
