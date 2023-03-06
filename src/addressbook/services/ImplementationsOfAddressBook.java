package addressbook.services;

import addressbook.interfaces.InterfaceAddressBook;
import addressbook.model.Contacts;
import addressbook.utility.JSONFile;

public class ImplementationsOfAddressBook implements InterfaceAddressBook{

	//SelfFileHandling selHandling = new SelfFileHandling();				//file_handling
	//CSVFile selHandling = new CSVFile();								//CSV file_Handling
	JSONFile selHandling = new JSONFile();							//JSON file_Handling
	
	public void welcomeDisplay() {
		System.err.println("===================================");
		System.out.println("  ::  Welcome To Address_Book  ::  ");
		System.err.println("==================================="+'\n');
		
	}

	public int createContactDetails(Contacts contacts) {
		System.out.println(" List of All the Contscts ");
		return selHandling.writeFile(contacts);				//JSON file_Handling
	}

		public void showAllContacts() {
			System.out.println("*************** : All Available Contacts- : ***************");
			selHandling.readFile();						//JSON file_Handling
		}
		
		
}
