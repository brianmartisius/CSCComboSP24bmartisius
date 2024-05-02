
public class Favorites extends ContactList {

	
		private String address = "";
		private String email = "";
		public Favorites() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Favorites(String address, String email) {
			super();
			this.address = address;
			this.email = email;
		}
		
		public Favorites(String firstName, String lastName, long phoneNumber, String address, String email) {
			super(firstName, lastName, phoneNumber);
			this.address = address;
			this.email = email;
			// TODO Auto-generated constructor stub
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return super.toString() + " Address = " + address + " Email = " + email;
		}
		
//		public Favorites (String address) {
//			this.address = address;
//		}
//		
//		public Favorites (String email) {
//			this.email = email;
//		}

		

}
