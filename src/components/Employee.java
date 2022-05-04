package components;

public class Employee {
    private String jobName, firstName, lastName;
    private long salary, dateOfHire;
    private Department department;

    public Employee() {}

    public Employee(String jobName, String firstName, String lastName, long salary, long dateOfHire, Department department) {
        this.jobName = jobName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.dateOfHire = dateOfHire;
        this.department = department;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(long dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public long modifySalary(long percent) {
        return this.salary + percent/100 * this.salary;
    }

    public void changeDepartment(Department department, String reason) throws Exception
    {
        if(reason.isEmpty())
            throw new Exception("Reason cannot be empty!");
        this.department = department;
    }
}
