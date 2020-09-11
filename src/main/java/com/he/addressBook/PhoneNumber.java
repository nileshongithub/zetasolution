package com.he.addressBook;

public class PhoneNumber {
    private String label;
    private String phoneNumber;

    public PhoneNumber(String label, String phoneNumber) throws Exception {
        // TODO
    	if(!ValidationUtil.isValidLable(label)) {
    		throw new IllegalArgumentException("Lable should be notNull, notEmpty, only alphabets and length < 255 characters");	
    	}
    	
    	if(!ValidationUtil.isValidPhoneNumber(phoneNumber)) {
    		throw new IllegalArgumentException("PhoneNumber should contains 10 digits");	
    	}
    	this.label = label;
    	this.phoneNumber = phoneNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
