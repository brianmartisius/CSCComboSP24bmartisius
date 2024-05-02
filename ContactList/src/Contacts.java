
public class Contacts {
	
	public static void main(String[] args) {
	
	
	ContactList contact1 = new ContactList();
	
	contact1 = new ContactList ("Joe", "Smith", 1234567890);
	
	System.out.println(contact1);
	
	ContactList contact2 = new Favorites ("RJ", "Jones", 1478523698, "456 Rockon Ave.", "rJones@email.com");
	
	System.out.println(contact2);
	
	//ContactList contact3 = new Favorites ("")
	
	}

}
