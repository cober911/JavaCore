package Seminar3.DZ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Главный класс программы
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Леша", 250, 30));
        employees.add(new Employee("Вася", 260, 30));
        employees.add(new Employee("Миша", 270, 30));
        employees.add(new Employee("Вова", 280, 30));
        employees.add(new Manager("Никита", 1000, 40));

        EmployeeView employeeView = new EmployeeView();
        Employee employee = new Employee(employees, employeeView);

        System.out.println("Cотрудники до повышения зп:");
        employee.printEmployeeDetails();

        employee.increaseSalary(employees.toArray(new Employee[0]), 10000);
        System.out.println("\nCотрудники после повышения зп:");
        employee.printEmployeeDetails();

        Collections.sort(employees, new Comparator());
        System.out.println("\nСортировка сотрудников по зп:");
        employee.printEmployeeDetails();
    }
}