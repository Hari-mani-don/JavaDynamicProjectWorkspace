package jsonPack2ManojBro;

import java.util.List;

public class Company {
    private String name;
    private List<DepartmentHari> departments;

    public Company() {
    }

    public Company(String name, List<DepartmentHari> departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DepartmentHari> getDepartments() {
        return departments;
    }

    public void setDepartments(List<DepartmentHari> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company [name=" + name + ", departments=" + departments + "]";
    }
    
}
