package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import contact.ContactServices;

@DisplayName("Testing Contact Service")
class ContactServiceTest {
	
	// Instantiate Contact Services object instance
	ContactServices cs = new ContactServices();
	
	@BeforeAll
	public static void setUpAll() {
		// Message printed to console
		System.out.println("Setting up Tests");
	}
	
	@BeforeEach
	// Initialize the data structure with an object instance for testing
	public void setUp() {
		cs.addContact("Jane123", "Jane", "Doe", "4521357471", "KFC Blvd");
	}
	
	@Test
	@DisplayName("Test Add Contact")
	// Member method to test the Contact Services Add Contact Method
	void testContactServicesTestAddContact() {
		
		// Contact Services add contact member method call
		cs.addContact("Bob123", "Bob", "Jenkins", "456789123", "500 Main");
		
		// Iterate over data structure to find object instance
		for (int i = 0; i < cs.contacts.size(); ++i) {
			
			// Check if current object instance Unique ID is a match
			if (cs.contacts.get(i).getUniqueID().equals("Bob123")) {
				
				// Run assertions when match is found
				assertTrue(cs.contacts.get(i).getUniqueID().equals("Bob123"));
				assertTrue(cs.contacts.get(i).getFirstName().equals("Bob"));
				assertTrue(cs.contacts.get(i).getLastName().equals("Jenkins"));
				assertTrue(cs.contacts.get(i).getPhoneNumber().equals("456789123"));
				assertTrue(cs.contacts.get(i).getAddress().equals("500 Main"));
			}
		}
	}
	
	@Test
	@DisplayName("Test Unique ID Too Long")
	// Member method to test add contact unique ID To Long
	void testContactServiceAddContactUniqueIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		    cs.addContact("Bob12345678", "Bob", "Jenkins", "456123789", "500 Main");
		}, "Didn't Work");
	}
	
	@Test
	@DisplayName("Test Unique Id Is Null")
	// Member method to test add contact unique ID is Null
	void testContactServiceAddContactUniqueIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cs.addContact(null, "Bob", "Jenkins", "456123789", "500 Main");
		});
	}
	
	@Test
	@DisplayName("Test First Name Too Long")
	// Member method to test add contact first name to Long
	void testContactServiceAddContactFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cs.addContact("Bob123", "Bob The Man Stan", "Jenkins", "456123789", "500 Main");
		});
	}
	
	@Test
	@DisplayName("Test First Name Is Null")
	// Member method to test add contact first name is Null
	void testContactServiceAddContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cs.addContact("Bob123", null, "Jenkins", "456123789", "500 Main");
		});
	}
	
	@Test
	@DisplayName("Test Last Name Too Long")
	// Member method to test add contact last name to Long
	void testContactServiceAddContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cs.addContact("Bob123", "Bob", "Jenkins Butler", "456123789", "500 Main");
		});
	}
	
	@Test
	@DisplayName("Test Last Name Is Null")
	// Member method to test add contact last name is null
	void testContactServiceAddContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cs.addContact("Bob123", "Bob", null, "456123789", "500 Main");
		});
	}
	
	@Test
	@DisplayName("Test Phone Number Too Long")
	// Member method to test add contact phone number too Long
	void testContactServiceAddContactPhoneNumberToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cs.addContact("Bob123", "Bob", "Jenkins", "456123789123", "500 Main");
		});
	}
	
	@Test
	@DisplayName("Test Phone Number Is Null")
	// Member method to test add contact phone number is Null
	void testContactServiceAddContactPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cs.addContact("Bob123", "Bob", "Jenkins", null, "500 Main");
		});
	}
	
	@Test
	@DisplayName("Test Address Too Long")
	// Member method to test add contact address too Long
	void testContactServiceAddContactAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cs.addContact("Bob123", "Bob", "Jenkins", "456123789", "500 Main Around The Block Down"
					+ " The Corner Across From Piggly Wiggly");
		});
	}
	
	@Test
	@DisplayName("Test Address Is Null")
	// Member method to test add contact address is null
	void testContactServiceAddContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			cs.addContact("Bob123", "Bob", "Jenkins", "456123789", null);
		});
	}
	
	@Test
	@DisplayName("Test Delete Contact")
	// Member method to test delete contact
	void testContactServiceDeleteContact() {
		cs.deleteContact("Jane123");
		assertEquals(cs.contacts.size(), 0);
	}
	
	@Test
	@DisplayName("Test Update Contact")
	// Member method to test update contact
	void testContactServicesUpdateContact() {
		
		// Declare and initialize boolean variable
		Boolean found = false;
		
		// Create object instance with arguments for testing
		cs.updateContact("Jane123", "John", "James", "123456789", "735 Drew Lane");
		
		// Iterate over data structure to find match
		for (int i = 0; i < cs.contacts.size(); ++i) {
			
			// Check if current instance unique ID is a match
			if (cs.contacts.get(i).getUniqueID().equals("Jane123")) {
				
				// Match found and set boolean variable to true
				found = true;
				
				// Run assertions on object instance variables
				assertTrue(cs.contacts.get(i).getFirstName().equals("John"));
				assertTrue(cs.contacts.get(i).getLastName().equals("James"));
				assertTrue(cs.contacts.get(i).getPhoneNumber().equals("123456789"));
				assertTrue(cs.contacts.get(i).getAddress().equals("735 Drew Lane"));
			}
		}
		// Check boolean variable 
		if (found == false) {
			
			// The test fails when the boolean variable is false
			// and contact not found
			fail("Could not Update");
		}
	}
}
