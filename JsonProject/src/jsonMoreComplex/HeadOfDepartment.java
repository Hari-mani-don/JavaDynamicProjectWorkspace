package jsonMoreComplex;

public class HeadOfDepartment {
	private String name;
	private String email;
	private String phone;

	public HeadOfDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HeadOfDepartment(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "HeadOfDepartment [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}
