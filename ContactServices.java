package contact;

import java.util.ArrayList;

// Class to handle Contacts
public class ContactServices {
	
	// Internal Data Structure To hold contact information
	public ArrayList<Contacts> contacts = new ArrayList<Contacts>();
	

	// Default class constructor
	public ContactServices() {}

	// Member method to add contact
	public void addContact (String m_uniqueID, String m_firstName, String m_lastName, String m_phone,
			               String m_address) {
		// Object instance
		Contacts c = new Contacts();
		
		// Contacts member method call to mutate unique ID instance
		c.setUniqueID(m_uniqueID);
		
		// Iterate over structure to find a match
		for (int i = 0; i < contacts.size(); ++ i) {
			
			// If match is found, then throw an exception
			if (contacts.get(i).getUniqueID().equals(m_uniqueID)) {
				throw new IllegalArgumentException("ID not available");
			}
		}
		
		// Contacts member mutator method call to set first name instance
		c.setFirstName(m_firstName);
		
		// Contacts member mutator method call to set last name instance
		c.setLastName(m_lastName);
		
		// Contacts member mutator method call to set phone number
		c.setPhoneNumber(m_phone);
		
		// Contacts member mutator method call to set address
		c.setAddress(m_address);
		
		// Add object instance to the data structure
		contacts.add(c);
	}
	
	// Member method to delete contact
	public void deleteContact(String m_uniqueID) {
		
		// Iterate over data structure
		for (int i = 0; i < contacts.size(); ++ i) {
			
			// Condition to check if match found
			if (contacts.get(i).getUniqueID().equals(m_uniqueID)) {
				
				// Delete object instance from data structure when match found
				contacts.remove(i);
			}
		}
	}
	
	// Member method to update contact
	public void updateContact(String m_uniqueID, String m_firstName, String m_lastName, String m_phone,
                              String m_address) {
		
		// Iterate over data structure to find m_uniqueID match
		for (int i = 0; i < contacts.size(); ++ i) {
			
			// Check if m_uniqueId match is found
			if (contacts.get(i).getUniqueID().equals(m_uniqueID)) {
				
				// Update contact object instance information
				contacts.get(i).setFirstName(m_firstName);
				contacts.get(i).setLastName(m_lastName);
				contacts.get(i).setPhoneNumber(m_phone);
				contacts.get(i).setAddress(m_address);
			}
		}
	}
}
