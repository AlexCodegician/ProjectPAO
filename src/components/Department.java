package components;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Department {
    private String name, location;
    private List<Employee> employees;

    public Department(String name, String location, List<Employee> employees) {
        this.name = name;
        this.location = location;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void sortEmployeesByHireDate() {
        Comparator<Employee> byHireDate = Comparator.comparing(Employee::getDateOfHire);
        Collections.sort(employees, byHireDate);
    }

}
