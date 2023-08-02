package com.semanticsquare.ex7;

public class Billing {
	   
    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        // your logic    
        if (patientInsurancePlan != null ) {
        	if (patientInsurancePlan instanceof PlatinumPlan) {
        		((PlatinumPlan) patientInsurancePlan).setCoverage(amount);  
        		payments[1] -= 50;
        	} else if (patientInsurancePlan instanceof GoldPlan) {
        		((GoldPlan) patientInsurancePlan).setCoverage(amount);
        		payments[1] -= 40;
        	} else if (patientInsurancePlan instanceof SilverPlan) {
        		((SilverPlan) patientInsurancePlan).setCoverage(amount);
        		payments[1] -= 30;
        	} else {     /* patientInsurancePlan instanceof BronzePlan */
        		((BronzePlan) patientInsurancePlan).setCoverage(amount);
        		payments[1] -= 25;
        	}
        	
        	payments[0] = (patientInsurancePlan).getCoverage();  
        	
        } else {
        	payments[0] = amount;
        	payments[1] -= 20;
        }
        
        payments[1] += amount - payments[0];

        return payments;
    }

    // Client Test
    public static void main(String[] args) {
    	HealthInsurancePlan insurancePlan = new GoldPlan();        
    	Patient patient = new Patient();
    	patient.setInsurancePlan(insurancePlan);
    	        
    	double[] payments = Billing.computePaymentAmount(patient, 1000.0);
    	System.out.println(payments[0] + "-" + payments[1]);
	}
}
