package Seminar3.DZ;
import java.util.List;

public class Employee {
    private String name;
    private Integer salary;
    private int age;
    private List<Employee> employees;
    private EmployeeView employeeView;

    public Employee(String name, Integer salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Employee(List<Employee> employees, EmployeeView employeeView) {
        this.employees = employees;
        this.employeeView = employeeView;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public double getAge() {
        return age;
    }

    public void increaseSalary(Integer amount) {
        salary += amount;
    }


    public static void increaseSalary(Employee[] employees, Integer amount) {
        for (Employee employee : employees
        ) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(amount);
            }
        }
    }

    public void printEmployeeDetails() {
        for (Employee employee : employees) {
            employeeView.printEmployeeDetails(employee);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                "age =" + age +'}';
    }
}
