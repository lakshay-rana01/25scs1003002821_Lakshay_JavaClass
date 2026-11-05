// Question 2.

public class Employee {
    

    private int employeeId;
    private String name;
    private String designation;
    private double salary;

    // Default Constructor
    public Employee() {
        this.employeeId = 0;
        this.name = "Not Set";
        this.designation = "Trainee";
        this.salary = 0.0;
    }

    // Parameterized Constructor
    public Employee(int employeeId, String name, String designation, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Copy Constructor
    public Employee(Employee emp) {
        this.employeeId = emp.employeeId;
        this.name = emp.name;
        this.designation = emp.designation;
        this.salary = emp.salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("ID: " + employeeId + " | Name: " + name + 
                           " | Designation: " + designation + " | Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(501, "Priya Patel", "Software Engineer", 85000.0);
        Employee e3 = new Employee(e2); // Copy of e2

        System.out.println("Object 1 (Default):");
        e1.displayEmployeeDetails();

        System.out.println("Object 2 (Parameterized):");
        e2.displayEmployeeDetails();

        System.out.println("Object 3 (Copy Constructor):");
        e3.displayEmployeeDetails();
    }
}

