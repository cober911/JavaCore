package Seminar3.DZ;

public class EmployeeView {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee{" +
                "name='" + employee.getName() + '\'' +
                ", salary=" + employee.getSalary() +
                ", age=" + employee.getAge() +
                '}');
    }
}

