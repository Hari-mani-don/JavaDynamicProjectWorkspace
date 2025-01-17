package jsonComplexPackage;

import java.util.List;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeePosition;
	private String employeeEmail;
	private double employeeSalary;
	private Contact contactDetails;
	private List<Project> projects;
	
	public Employee() {}

	public Employee(int employeeId, String employeeName, String employeePosition, String employeeEmail,
			double employeeSalary, Contact contactDetails, List<Project> projects) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePosition = employeePosition;
		this.employeeEmail = employeeEmail;
		this.employeeSalary = employeeSalary;
		this.contactDetails = contactDetails;
		this.projects = projects;
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

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
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

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePosition="
				+ employeePosition + ", employeeEmail=" + employeeEmail + ", employeeSalary=" + employeeSalary
				+ ", contactDetails=" + contactDetails + ", projects=" + projects + "]";
	}
	
	
}
