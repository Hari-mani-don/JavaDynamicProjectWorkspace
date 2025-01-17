package jsonMoreComplex;

import java.util.List;

public class Department {
	private String departmentName;
	private HeadOfDepartment headOfDepartment;
	private List<Employee> employeeList;

	public Department() {
		super();

	}

	public Department(String departmentName, HeadOfDepartment headOfDepartment, List<Employee> employeeList) {
		super();
		this.departmentName = departmentName;
		this.headOfDepartment = headOfDepartment;
		this.employeeList = employeeList;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public HeadOfDepartment getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(HeadOfDepartment headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", headOfDepartment=" + headOfDepartment
				+ ", employeeList=" + employeeList + "]";
	}

}
