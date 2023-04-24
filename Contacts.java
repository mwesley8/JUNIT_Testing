package contact;

 

public class Contacts {
	// Private member variables
	private String uniqueID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	// Default Constructor
	public Contacts() {}
	
	// Custom Overloaded Constructor
	public Contacts(String m_uniqueID, String m_firstName, String m_lastName, String m_phone, String m_address) {
		
		// Condition to check length and null status
		if (m_uniqueID == null || m_uniqueID.length() > 10) {
			throw new IllegalArgumentException ("Invalid ID");
		}
		
		// Condition to check length and null status
		if (m_firstName == null || m_firstName.length() > 10) {
			throw new IllegalArgumentException ("Invalid First Name");
		}
		
		// Condition to check length and null status
		if (m_lastName == null || m_lastName.length() > 10) {
			throw new IllegalArgumentException ("Invalid Last Name");
		}
		
		// Condition to check length and null status
		if (m_phone == null || m_phone.length() > 10) {
			throw new IllegalArgumentException ("Invalid Phone Number");
		}
		
		// Condition to check length and null status
		if (m_address == null || m_address.length() > 30) {
			throw new IllegalArgumentException ("Invalid Address");
		}
		
		// Set Contact member variables when previous conditions are false
		this.uniqueID = m_uniqueID;
		this.firstName = m_firstName;
		this.lastName = m_lastName;
		this.phoneNumber = m_phone;
		this.address = m_address;
	}
	
	// Member mutator method to set the unique ID with exception handling
	public void setUniqueID(String m_uniqueID) {
		
		// Condition to check length and null status
		if (m_uniqueID == null || m_uniqueID.length() > 10) {
			throw new IllegalArgumentException ("Invalid ID");
		}
		
		// Set member variable when previous condition false
		this.uniqueID = m_uniqueID;
	}
	
	// Member mutator method to set first name with exception handling
	public void setFirstName(String m_firstName) {
		
		// Condition to check length and null status
		if (m_firstName == null || m_firstName.length() > 10) {
			throw new IllegalArgumentException ("Invalid First Name");
		}
		
		// Set member variable when previous condition is false
		this.firstName = m_firstName;
	}
	
	// Member mutator method to set last name with exception handling
	public void setLastName(String m_lastName) {
		
		// Condition to check length and null status
		if (m_lastName == null || m_lastName.length() > 10) {
			throw new IllegalArgumentException ("Invalid Last Name");
		}
		
		// Set member variable when previous condition is false
		this.lastName = m_lastName;
	}
	
	// Member mutator method to set last name with exception handling
	public void setPhoneNumber(String m_phoneNumber) {
		
		// Condition to check length and null status
		if (m_phoneNumber == null || m_phoneNumber.length() > 10) {
			throw new IllegalArgumentException ("Invalid Phone Number");
		}
		
		// Set member variable when previous condition is false
		this.phoneNumber = m_phoneNumber;
	}
	
	// Member mutator method to set Address with exception handling
	public void setAddress(String m_address) {
		
		// Condition to check length and null status
		if (m_address == null || m_address.length() > 30) {
			throw new IllegalArgumentException ("Invalid Address");
		}
		
		// Set member variable when previous condition is false
		this.address = m_address;
	}
	
	// Member accessor method to return unique ID object instance
	public String getUniqueID() {
		return this.uniqueID;
	}
	
	// Member accessor method to return first name object instance
	public String getFirstName() {
		return this.firstName; 
	}
	
	// Member accessor method to return last name object instance
	public String getLastName() {
		return this.lastName;
	}
	
	// Member accessor method to return phone number object instance
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	// Member accessor method to return address object instance
	public String getAddress() {
		return this.address;
	}
}
