package jsonPack2ManojBro;

import java.util.List;

public class DepartmentHari {
    private String name;
    private List<EmployeeClass> employeeList;

    public DepartmentHari() {
    }

    public DepartmentHari(String departmentName, List<EmployeeClass> employeeList) {
        this.name = departmentName;
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String departmentName) {
        this.name = departmentName;
    }

    public List<EmployeeClass> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<EmployeeClass> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department [departmentName=" + name + ", employeeList=" + employeeList + "]";
    }
}
