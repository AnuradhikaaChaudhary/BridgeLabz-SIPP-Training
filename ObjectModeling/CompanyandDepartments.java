package ObjectModeling;

import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String name;
    ArrayList<Employee> employees;

    Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments;

    Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void displayCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.displayEmployees();
        }
    }
}

public class CompanyandDepartments {
    public static void main(String[] args) {
        Company company = new Company("Tech Corp");

        Department dev = new Department("Development");
        dev.addEmployee(new Employee("John"));
        dev.addEmployee(new Employee("Jane"));

        Department hr = new Department("HR");
        hr.addEmployee(new Employee("Alice"));

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.displayCompany();
    }
}
