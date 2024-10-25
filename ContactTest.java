package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
	@Test
	void testContactClass() {
		Contact contact = new Contact("Adam", "Khan", "1234567890", "123 Main St");
		assertTrue(contact.getfirstName().equals("Adam"));
		assertTrue(contact.getlastName().equals("Khan"));
	}
	

	@Test
	void testfirstNameNotNull() {
		Contact contact = new Contact("Adam", "Khan", "1234567890", "123 Main St");
		String firstName = contact.getfirstName();
		
		assertNotNull(firstName);
	}
	
	@Test
	void testConstructorWithNullFirstNameThrowsException() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(null, "Khan", "1234567890", "123 Main St"); 
	    });
	}
	
	@Test
	void testConstructorWithNullLastNameThrowsException() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("Adam", null, "1234567890", "123 Main St"); 
	    });
	}
	
	@Test
	void testConstructorWithNullPhoneNumberThrowsException() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("Adam", "Kramez", null, "123 Main St"); 
	    });
	}
	
	@Test
	void testConstructorWithNullAddressThrowsException() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("Adam", "Kramez", "1234567890", null); 
	    });
	}
	
	@Test
	void testConstructorWithTooLongFirstNameThrowsException() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("Thisnameiswaywaytoolong", "Kramez", "1234567890", "123 Main St"); 
	    });
	}
	
	@Test
	void testConstructorWithTooLongLastNameThrowsException() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("Adam", "Thisnameiswaywaytoolong", "1234567890", "123 Main St"); 
	    });
	}
	
	@Test
	void testConstructorWithTooLongPhoneNumberThrowsException() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("Adam", "Kramez", "12345678901232345566", "123 Main St"); 
	    });
	}
	
	@Test
	void testConstructorWithTooLongAddressThrowsException() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("Adam", "Kramez", "1234567890", "Thisaddressiswaywaywaywaywaywaytoolong"); 
	    });
	}

	@Test
	void testidlengthIs8() {
		Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
		assertEquals(8, contact.getid().length());
	}
	
	@Test
	void testidIsNotNull() {
		Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
		assertNotNull(contact.getid());
	}
	
	@Test
	void testgetid() {
		Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
		
		String tempidHolder = contact.getid();
		
		assertEquals(contact.getid(), tempidHolder);
	}
	
	
	
	@Test
	void longfirstnameshouldreturnIllegalargumentexception() {
		Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
	    assertThrows(IllegalArgumentException.class, () -> {
	        contact.setfirstName("Johnjohnjohnjohnjohn"); 
	    });
	}
	
	@Test
	void testfirstNameIsNull( ) {
		Contact contact = new Contact("Jim", "Doe", "1234567890", "123 Main St");
		assertThrows(IllegalArgumentException.class, () -> {
	        contact.setfirstName(null); 
	    });
	}
	
	@Test
	void testSetFirstName() {
	    Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
	    contact.setfirstName("Adam");
	    assertEquals("Adam", contact.getfirstName());
	}
	
	@Test
	void testSetLastName() {
	    Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
	    contact.setlastName("Smith");
	    assertEquals("Smith", contact.getlastName());
	}
	
	@Test
	void testlastNameIsNull( ) {
		Contact contact = new Contact("Jack", "Doe", "1234567890", "123 Main St");
		assertThrows(IllegalArgumentException.class, () -> {
	        contact.setlastName(null); 
	    });
	}
	
	@Test
	void testphoneNumberIsNull( ) {
		Contact contact = new Contact("Jack", "Doe", "1234567890", "123 Main St");
		assertThrows(IllegalArgumentException.class, () -> {
	        contact.setphoneNumber(null); 
	    });
	}
	
	@Test
	void testSetPhoneNumber() {
	    Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
	    contact.setphoneNumber("0987654321");
	    assertEquals("0987654321", contact.getphoneNumber());
	}
	
	void testgetPhoneNumber( ) {
		Contact contact = new Contact("Jack", "Doe", "1234567890", "123 Main St");
		assertTrue(contact.getphoneNumber().equals("1234567890"));
	}
	
	
	@Test
	void testaddressIsNull( ) {
		Contact contact = new Contact("Jack", "Doe", "1234567890", "123 Main St");
		assertThrows(IllegalArgumentException.class, () -> {
	        contact.setaddress(null); 
	    });
	}
	
	@Test
	void testSetAddress() {
	    Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
	    contact.setaddress("456 Elm St");
	    assertEquals("456 Elm St", contact.getaddress());
	}
	

	
}

