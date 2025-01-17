package jsonMoreComplex;

import java.util.List;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeePosition;
	private double employeeSalary;
	private String employeeEmail;
	private Contact contactDetails;
	private List<Project> projects;
	private List<Campaigns> campaigns;


	public Employee(int employeeId, String employeeName, String employeePosition, double employeeSalary,
			String employeeEmail, Contact contactDetails, List<Project> projects, List<Campaigns> campaigns) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePosition = employeePosition;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.contactDetails = contactDetails;
		this.projects = projects;
		this.campaigns = campaigns;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Contact getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(Contact contactDetails) {
		this.contactDetails = contactDetails;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Campaigns> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<Campaigns> campaigns) {
		this.campaigns = campaigns;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePosition="
				+ employeePosition + ", employeeSalary=" + employeeSalary + ", employeeEmail=" + employeeEmail
				+ ", contactDetails=" + contactDetails + ", projects=" + projects + ", campaigns=" + campaigns + "]";
	}
	
}
