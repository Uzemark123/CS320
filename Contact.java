package Contact;

import java.util.UUID;


public class Contact {

	private String id; 
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String firstName, String lastName, String phoneNumber, String address) {
		
		this.id = UUID.randomUUID().toString().substring(0, 8);
		
		if (id == null || id.length() > 10 || id.length() <= 0) {
			throw new IllegalArgumentException("Invalid id");
			}
		
		if (firstName == null || firstName.length() > 10 || firstName.length() <= 0) {
			throw new IllegalArgumentException("Invalid first name");
			}
		this.firstName = firstName;
		
		if (lastName == null || lastName.length() > 10 || lastName.length() <= 0) {
			throw new IllegalArgumentException("Invalid last name");
			}
		
		
		this.lastName = lastName;
		
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
			}
		
		this.phoneNumber = phoneNumber;
		
		if (address == null || address.length() > 30 || address.length() <= 0) {
			throw new IllegalArgumentException("Invalid address");
			}
		
		this.address = address;
		}
	
	
	public String getid() {
		return this.id;
		}
	
	public void setfirstName(String firstName) {
		if (firstName == null || firstName.length() > 10 || firstName.length() <= 0) {
			throw new IllegalArgumentException("Invalid first name");
			}
		this.firstName = firstName;
		}
	
	public String getfirstName() {
		
		return this.firstName;
	}
	
	public void setlastName(String lastName) {
		if (lastName == null || lastName.length() > 10 || lastName.length() <= 0) {
			throw new IllegalArgumentException("Invalid last name");
			}
		this.lastName = lastName;
		}
	
	public String getlastName() {
		
		return this.lastName;
		}
	
	public void setphoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
			}
		this.phoneNumber = phoneNumber;
		}
	
	public String getphoneNumber() {
		
		return this.phoneNumber;
		}
	
	public void setaddress(String address) {
		if (address == null || address.length() > 30 || address.length() <= 0) {
			throw new IllegalArgumentException("Invalid address");
			}
		this.address = address;
		}
	
	public String getaddress() {
		
		return this.address;
		}
	}



