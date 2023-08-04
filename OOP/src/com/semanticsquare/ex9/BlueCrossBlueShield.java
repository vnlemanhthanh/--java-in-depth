package com.semanticsquare.ex9;

public class BlueCrossBlueShield implements InsuranceBrand {
	private long id;
	private String name;

	public long getId() {
		return id;

	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
		double result = 0.0;
		if (insurancePlan instanceof PlatinumPlan) {
			if (age > 55 ) result += 200;
			if (smoking) result += 100;
		}
		if (insurancePlan instanceof GoldPlan) {
			if (age > 55 ) result += 150;
			if (smoking) result += 90;
		}
		if (insurancePlan instanceof SilverPlan) {
			if (age > 55 ) result += 100;
			if (smoking) result += 80;
		}
		if (insurancePlan instanceof BronzePlan) {
			if (age > 55 ) result += 50;
			if (smoking) result += 70;
		}
		
		return result;
	}
}





















