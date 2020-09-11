package com.he.addressBook;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private String            name;
    private String            organisation;
    private List<PhoneNumber> phoneNumbers;
    private List<Address>     addresses;

    public Contact(String name, String organisation) throws Exception {
        // TODO
    	if(!ValidationUtil.isValidLable(name)) {
    		throw new IllegalArgumentException("Name should be notNull, notEmpty, only alphabets and length < 255 characters");	
    	}
    	this.name = name;
    	if(ValidationUtil.isStringNull(organisation) || ValidationUtil.exceedLength(organisation)) {
    		throw new IllegalArgumentException("Organization name should not be null and length should be < 255");
    	}
    	this.organisation = organisation;
    }
    
    public Contact(String name, String organisation, PhoneNumber phoneNumber, Address address) throws Exception {
        // TODO
    	this.name = name;
    	this.organisation = organisation;
    	// todo 
    	// add address and phone number
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }
        this.phoneNumbers.add(phoneNumber);

    }

    public void addAddress(Address address) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(address);
    }

}