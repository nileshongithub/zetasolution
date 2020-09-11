package com.he.addressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

	 private List<Contact> contacts;
	
    public AddressBook() {
        //TODO
    }

    public void addContact(Contact contact) throws Exception {
        //TODO
    	if(this.contacts == null) {
    		this.contacts = new ArrayList<Contact>();
    	}
    	
    	if(hasContactInList(contact)) {
    		throw new Exception("Duplicate contact found");
    	}
    	this.contacts.add(contact);
    }

    public void deleteContact(String name) {
        //TODO
    	if(this.contacts != null) {
//    		this.contacts.forEach(c -> {
//    			if(c.getName().equals(name)) {
//    				this.contacts.remove(c);
//    			}
//    		});
    		
        	Iterator<Contact> itr = contacts.iterator();
        	while(itr.hasNext()) {
        		Contact c = itr.next();
        		if(c.getName().equals(name)) {
        			itr.remove();
        		}
        	}
    	}

    	
    }

    public void updateContact(String name, Contact contact) throws Exception {
        //TODO
  
    	Contact con = contacts.stream().filter(c -> c.getName().equals(name)).findFirst().get();
    	if(con != null) {
    		// code to update
    	}
    	else {
    		throw new Exception("The name does not exists");
    	}
    	
    }

    public List<Contact> searchByName(String name) {
        //TODO
    	if(name.equals("")) {
    		return new ArrayList<>(contacts);
    	}
    	List<Contact> result = contacts.stream().filter(c -> c.getName().toUpperCase().startsWith(name.toUpperCase())).collect(Collectors.toList());
        return result;
    }

    public List<Contact> searchByOrganisation(String organisation) {
        //TODO
    	if(organisation.equals("")) {
    		return new ArrayList<>(contacts);
    	}
    	List<Contact> result = contacts.stream().filter(c -> !(c.getOrganisation().isEmpty()) && c.getOrganisation().toUpperCase().startsWith(organisation.toUpperCase())).collect(Collectors.toList());
        return result;
    }
    
    private boolean hasContactInList(Contact contact) {
    	boolean result = contacts.stream().anyMatch(c -> c.getName().contentEquals(contact.getName()));
    	return result;
    }

}