package com.semanticsquare.ex7;

public class BronzePlan extends HealthInsurancePlan {
	@Override
	public void setCoverage(double coverage) {
		super.setCoverage(coverage * 0.6) ;
	}
}
