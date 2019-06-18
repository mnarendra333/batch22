package pack9;

public class Contact {

	private String contactName;
	private long mobNumber;

	public String getContactName() {
		return contactName;
	}

	public long getMobNumber() {
		return mobNumber;
	}

	
	public Contact(String contactName, long mobNumber) {
		super();
		this.contactName = contactName;
		this.mobNumber = mobNumber;
	}
	
	
	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", mobNumber=" + mobNumber + "]";
	}


}
