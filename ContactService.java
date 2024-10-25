package Contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class ContactService {
	String id; 
	String firstName;
	String updatedfirstName;
	String lastName;
	String updatedlastName;
	String phoneNumber;
	String updatedphoneNumber;
	String address;
	String updatedaddress;
	
    
    private HashMap<String, Contact> contactsMap; // updated ds
	
    public ContactService() {
    	contactsMap = new HashMap<>();
    }
    
	public Contact getContactByid(String id) {
		return contactsMap.get(id);
	}

    
	public void addContact(Contact contact) {
		contactsMap.put(contact.getid(), contact); 
		}
	
	
	public void removeContact(String id) {
		contactsMap.remove(id);
	}
	
	
	public void updatefirstName(String id, String updatedfirstName) {
		Contact contact = contactsMap.get(id);
		contact.setfirstName(updatedfirstName);
		
	}
	
	public void updatelastName(String id, String updatedlastName) {
		Contact contact = contactsMap.get(id);
		contact.setlastName(updatedlastName);
		
	}
	
	public void updatephoneNumber(String id, String updatedphoneNumber) {
		Contact contact = contactsMap.get(id);
		contact.setphoneNumber(updatedphoneNumber);
		
	}
	
	public void updateaddress(String id, String updatedaddress) {
		Contact contact = contactsMap.get(id);
		contact.setaddress(updatedaddress);
		
	}
	
	
}
