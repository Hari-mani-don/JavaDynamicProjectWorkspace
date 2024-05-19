package jsonMoreComplex;

import java.util.List;

public class Company {
	private String companyName;
	private int establishedYear;
	private Location location;
	private List<Department> departments;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(String companyName, int establishedYear, Location location, List<Department> departments) {
		super();
		this.companyName = companyName;
		this.establishedYear = establishedYear;
		this.location = location;
		this.departments = departments;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getEstablishedYear() {
		return establishedYear;
	}

	public void setEstablishedYear(int establishedYear) {
		this.establishedYear = establishedYear;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", establishedYear=" + establishedYear + ", location=" + location
				+ ", departments=" + departments + "]";
	}

}
