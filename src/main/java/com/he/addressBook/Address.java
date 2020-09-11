package com.he.addressBook;

public class Address {

	private String label;
	private String address;
	
	public Address(String label, String address) throws Exception {
		// TODO
		if(!ValidationUtil.isValidLable(label)) {
    		throw new IllegalArgumentException("Lable should be notNull, notEmpty, only alphabets and length < 255 characters");	
    	}
		this.label = label;
		this.address = address; // no rules provided for address
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public String getAddress() {
		return this.address;
	}
}
