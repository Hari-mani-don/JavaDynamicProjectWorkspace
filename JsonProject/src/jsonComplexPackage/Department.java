package jsonComplexPackage;

import java.util.List;

public class Department {
	private String departmentName;
	private String headOfDepartment;
	private List<Employee> employeeList;

	public Department() {
	}

	public Department(String departmentName, String headOfDepartment, List<Employee> employeeList) {
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

	public String getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(String headOfDepartment) {
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
