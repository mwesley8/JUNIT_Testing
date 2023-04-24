package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import contact.Contacts;

@DisplayName("Test Contact Class")
class ContactTest {
	Contacts c = new Contacts();
	
	@Test
	@DisplayName("Test Contact Contructor" + " 🌝")
	// Member method to test the Contact Class Overloaded constructor
	void testContactClass() {
		
		// Create object instance with overloaded constructor and arguments
		Contacts contact = new Contacts("Bob123", "Bob", "Wilson", "8885699876", "500 Main");
		
		// Run tests on newly created object instance
		assertTrue(contact.getUniqueID().equals("Bob123"));
		assertTrue(contact.getFirstName().equals("Bob"));
		assertTrue(contact.getLastName().equals("Wilson"));
		assertTrue(contact.getPhoneNumber().equals("8885699876"));
		assertTrue(contact.getAddress().equals("500 Main"));
	}
	
	@Test
	@DisplayName("Test Contact Constructor Unique ID Too Long")
	// Member method to Test Contact Constructor Unique ID Too Long
	void testContactClassUniqueIdIsToLong() {
		
		// Run assertion test when unique ID too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("BOB456789123", "Bob", "Wilson", "8885699876", "500 Main");
			});}
	
	@Test
	@DisplayName("Test Contact Contructor Unique ID Is Null")
	// Member Method to Test Contact Constructor Unique ID Is Null
	void testContactClassUniqueIdIsNull() {
		
		// Run assertion test when unique id is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts(null, "Bob", "Wilson", "8885699876", "500 Main");});}
	
	@Test
	@DisplayName("Test Contact Constructor First Name Too Long")
	// Member method to Test Contact Constructor First Name Too Long
	void testContactClassFirstNameIsToLong() {
		
		// Run assertion test when first name is too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("Bob123", "Bob456789123", "Wilson", "8885699876", "500 Main");});}
	
	@Test
	@DisplayName("Test Contact Constructor First Name is Null")
	// Member method to Test Contact Constructor First Name is Null
	void testContactClassFirstNameIsNull() {
		
		// Run assertion test when first name is null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("Bob123", null, "Wilson", "8885699876", "500 Main");});}
	
		
	@Test
	@DisplayName("Test Contact Constructor Last Name Is Too Long")
	// Member method to Test Contact Constructor Last Name is Too Long
	void testContactClassLastNameIsToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("Bob123", "Bob", "Wilson789123", "8885699876", "500 Main");});}
	
		
	@Test
	@DisplayName("Test Contact Constructor Last Name Is Null")
	// Member method to Test Contact Constructor Last Name Is Null
	void testContactClassLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("Bob123", "Bob", null, "8885699876", "500 Main");});}
	
	@Test
	@DisplayName("Test Contact Constructor Phone Number Is Too Long")
	// Member method to Test Contact Constructor Phone Number Is Too Long
	void testContactClassPhoneNumberIsToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("Bob123", "Bob", "Wilson", "888569987623", "500 Main");});}
	
	@Test
	@DisplayName("Test Contact Constructor Phone Number Is Null")
	// Member method to Test Contact Constructor Phone Number Is Null
	void testContactClassPhoneNumberIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("Bob123", "Bob", "Wilson", null, "500 Main");});}
	
	@Test
	@DisplayName("Test Contact Constructor Address To Long")
	// Member method to Test Contact Constructor Address To Long
	void testContactClassAddressIsToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("Bob123", "Bob", "Wilson", "8885699876", "500 Mountain Avenue South Down The"
					+ "Road Around The Corner");});}
	
	@Test
	@DisplayName("Test Contact Contructor Address Is Null")
	// Member method to Test Contact Constructor Address Is Null
	void testContactClassAddressIsToNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contacts("Bob123", "Bob", "Wilson", "8885699876", null);});}
	
	@Test
	@DisplayName("Test Contact Mutators")
	void testContactMutators() {
		Assertions.assertAll("Contact Mutators", () ->
		    assertThrows(IllegalArgumentException.class, () -> {
		    	
		    // Test mutator with Unique ID to long
			c.setUniqueID("BOBIJENDKIENE");
			}), () -> assertThrows(IllegalArgumentException.class, () -> {
			
			// Test mutator with Unique ID null	
			c.setUniqueID(null);
			}), () -> assertThrows(IllegalArgumentException.class, () -> {
			
			// Test mutator with First Name too long
			c.setFirstName("BOBkenenekeneke");
			}), () -> assertThrows(IllegalArgumentException.class, () -> {
			
			// Test mutator with First Name null
			c.setFirstName(null);
			}), () -> assertThrows(IllegalArgumentException.class, () -> {
			
			// Test mutator with Last Name too long
			c.setLastName("WilsonTheTilson");
			}), () -> assertThrows(IllegalArgumentException.class, () -> {
			
			// Test mutator with Last Name null
			c.setLastName(null);
			}), () -> assertThrows(IllegalArgumentException.class, () -> {
			
			// Test mutator with phone number too long
			c.setPhoneNumber("471236547859");
			}), () -> assertThrows(IllegalArgumentException.class, () -> {
			
			// Test mutator with phone number null
			c.setPhoneNumber(null);
			}), () -> assertThrows(IllegalArgumentException.class, () -> {
				
			// Test mutator with address too long
			c.setAddress("400 Main Down West Compton Ave Across from 7-11");
			}), () -> assertThrows(IllegalArgumentException.class, () -> {
			
			// Test mutator with address null
			c.setAddress(null);
			})
			);
		}
}
