package jsonComplexPackage;

import java.util.List;

public class Company {

	private String companyName;
	private String location;
	private int establishedYear;
	List<Department> departments;

	public Company() {
	}

	public Company(String companyName, String location, int establishedYear, List<Department> departments) {
		super();
		this.companyName = companyName;
		this.location = location;
		this.establishedYear = establishedYear;
		this.departments = departments;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEstablishedYear() {
		return establishedYear;
	}

	public void setEstablishedYear(int establishedYear) {
		this.establishedYear = establishedYear;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", location=" + location + ", establishedYear=" + establishedYear
				+ ", departments=" + departments + "]";
	}
	
	

}
