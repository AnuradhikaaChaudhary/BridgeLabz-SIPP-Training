package KeyWords;
class Employee {
    
    static String companyName = "Tech Solutions Ltd.";

    
    private static int totalEmployees = 0;

   
    private String name;
    private final int id; 
    private String designation;

    
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    
    public void displayEmployeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("---------------------------");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("Anuradhika ", 101, "Software Engineer");
        Employee e2 = new Employee("Kanishka", 102, "Project Manager");
        Employee e3 = new Employee("Kratika", 103, "Data Analyst");

        
        if (e1 instanceof Employee) {
            e1.displayEmployeeDetails();
        }

        if (e2 instanceof Employee) {
            e2.displayEmployeeDetails();
        }

        if (e3 instanceof Employee) {
            e3.displayEmployeeDetails();
        }

        
        Employee.displayTotalEmployees();
    }
}
