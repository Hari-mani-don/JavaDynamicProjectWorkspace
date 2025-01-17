package jsonComplexPackage;

public class Contact {
	private String phone;
	private Address address;

	public Contact() {
	}

	public Contact(String phone, Address address) {
		super();
		this.phone = phone;
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact [phone=" + phone + ", address=" + address + "]";
	}
	
}
