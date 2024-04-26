package model;

import javax.persistence.*;

@Entity
@Table(name="Employee_Table")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name="emp_id")
    private long empId;

    @Column(name="emp_name")
    private String empName;

    @Column(name="emp_salary")
    private double empSalary;

    @Column(name="emp_email", unique=true)
    private String empEmail;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="task_id")
    private Task task;

    public Employee() {}

    public Employee(long empId, String empName, double empSalary, String empEmail, Task task) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empEmail = empEmail;
        this.task = task;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empEmail=" + empEmail + ", task=" + task + "]";
    }
}