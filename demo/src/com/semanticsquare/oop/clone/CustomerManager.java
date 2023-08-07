package com.semanticsquare.oop.clone;

public class CustomerManager {
	
	public Customer getCustomer(String acctId) {		
		Customer customer = fetchCustomer(acctId);	
		Customer clone = customer.clone();
		
		if (clone != null && clone != customer) {
			System.out.println("Clone successful");
			
			clone.setCreditScore(200);
			clone.setName("Tao lao");
			String[] accountTypes = clone.getAccountTypes();
			accountTypes[1] = null;
			
			System.out.println(clone.toString());
			System.out.println(customer.toString());
			
		}
		return customer;
	}

	private Customer fetchCustomer(String acctId) {
		Customer customer = new Customer(acctId, "Dheeru", 400,
				new String[] {"saving", "current"});
		return customer;
	}
}
