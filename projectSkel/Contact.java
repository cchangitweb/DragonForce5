// HC
public class Contact {
// initialize variables
		private String firstName;  
		private String lastName;
		private String streetAddress;
		private String emailAddress;
		private String phoneNumber;
		private String Notes;
		
		public Contact(String fname, String lname, String st, String e, String ph, String n)
		{
// constructor creates fields for each contact;
	            System.out.println(" constructor  Contact(String fname,  String lname, String st, String e,      String ph, String n) called.");
		}
		
// Methods to set values for each field
		public void setFirstName(String fname) {
		    System.out.println(" method  setFirstName(String fname) called.");
		}
		
		public void setLastName(String lname) {
		    System.out.println(" method  setLastName(String lname) called.");
		}
		
		public void setEmailAddress(String e){
	               System.out.println(" method  setEmailAddress(String e) called.");
		}
		
	  	public void setStreetAddress(String st){
	               System.out.println(" method  setStreetAddress(String st) called.");
		}
	  
	  	public void setPhoneNumber(String ph){
	  	    System.out.println(" method  setPhoneNumber(String ph) called.");
	  	}
	  
	  	public void setNotes(String n){
	  	    System.out.println(" method  setNotes(String n) called.");
	  	}
	  	
// Methods to get values from each field  
	  	public String getFirstName() {
		    System.out.println(" method  getFirstName() called.");
		    return firstName;
		}
		
		public String getLastName() {
		    System.out.println(" method  getLastName() called.");
		    return lastName;
		}
		
	  	public String getEmailAddress(){
		    System.out.println(" method  getEmailAddress() called.");
		    return emailAddress;
		}
		
	  	public String getStreetAddress(){
	        System.out.println(" method  getStreetAddress() called.");
	        return streetAddress; 
		}
	  
	  	public String getPhoneNumber(){
	  	    System.out.println(" method  getPhoneNumber() called.");
	  	    return phoneNumber;
	  	}
	  
	  	public String getNotes(){
	  	    System.out.println(" method  getNotes() called.");
	  	    return Notes;
	  	}   
	}
