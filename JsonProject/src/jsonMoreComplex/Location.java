package jsonMoreComplex;

public class Location {
	private String address;
	private String city;
	private String state;
	private String zip;
	private String country;

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(String address, String city, String state, String zip, String country) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;

	}

	public String getAddress() {

		return address;

	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {

		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Location [address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
				+ country + "]";
	}

}
