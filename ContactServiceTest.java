package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	

	@Test
	void testAddContact() {
	    ContactService service = new ContactService();
	    Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
	    service.addContact(contact);
	    assertEquals(contact, service.getContactByid(contact.getid()));
	}
	
	@Test
	void testRemoveContact() {
	    ContactService service = new ContactService();
	    Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
	    service.addContact(contact);
	    
	    service.removeContact(contact.getid());

	    assertNull(service.getContactByid(contact.getid()));
	}
	
	@Test
	void testUpdateFirstName() {
	    ContactService service = new ContactService();
	    Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
	    service.addContact(contact);
	    
	    String updatedfirstName = "Jim";
	    
	    service.updatefirstName(contact.getid(), updatedfirstName);

	    assertEquals("Jim", service.getContactByid(contact.getid()).getfirstName());
	}
	
	@Test
	void testUpdateLastName() {
	    ContactService service = new ContactService();
	    Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
	    service.addContact(contact);
	    
	    String updatedlastName = "Maven";
	    
	    service.updatelastName(contact.getid(), updatedlastName);

	    assertEquals("Maven", service.getContactByid(contact.getid()).getlastName());
	}
	
	@Test
	void testUpdatePhoneNumber() {
	    ContactService service = new ContactService();
	    Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
	    service.addContact(contact);
	    
	    String updatedphoneNumber = "1134567890";
	    
	    service.updatephoneNumber(contact.getid(), updatedphoneNumber);

	    assertEquals("1134567890", service.getContactByid(contact.getid()).getphoneNumber());
	}
	
	@Test
	void testUpdateAddress() {
	    ContactService service = new ContactService();
	    Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
	    service.addContact(contact);
	    
	    String updatedaddress = "234 Main St";
	    
	    service.updateaddress(contact.getid(), updatedaddress);

	    assertEquals("234 Main St", service.getContactByid(contact.getid()).getaddress());
	}
	


} 
