
public class ContactList {

		private String firstName = "";
		private String lastName = "";
		private long phoneNumber;
		public ContactList() {
		
			this.phoneNumber = 811;
		}
		public ContactList(String firstName, String lastName, long phoneNumber) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		@Override
		public String toString() {
		//	return "ContactList [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
		//			+ "]";
			return "Name: " + firstName + " " + lastName + "\nPhone Number: " + phoneNumber;
			
			
		}
		
		
		
		
		
		
		
		
		

	

}
