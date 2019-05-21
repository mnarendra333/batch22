package pack1;

public class Address {

	private String streetName;
	private String cityName;
	private String state;
	private int pinCode;

	public Address(String streetName, String cityName, String state, int pinCode) {
		super();
		this.streetName = streetName;
		this.cityName = cityName;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public String getState() {
		return state;
	}

	public int getPinCode() {
		return pinCode;
	}

}
