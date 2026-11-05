// Question 4.

public class MultilevelInheritance {
    
class Emp {
    protected int employeeId;
    protected String employeeName;
    protected double basicSalary;

    public Emp(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }
}

class Manager extends Emp {
    protected String department;
    protected int teamSize;

    public Manager(int employeeId, String employeeName, double basicSalary, String department, int teamSize) {
        super(employeeId, employeeName, basicSalary);
        this.department = department;
        this.teamSize = teamSize;
    }
}

class ProjectManager extends Manager {
    private String projectName;
    private int projectDuration;

    public ProjectManager(int employeeId, String employeeName, double basicSalary, 
                          String department, int teamSize, String projectName, int projectDuration) {
        super(employeeId, employeeName, basicSalary, department, teamSize);
        this.projectName = projectName;
        this.projectDuration = projectDuration;
    }

    public void displayDetails() {
        System.out.println("Employee ID      : " + employeeId);
        System.out.println("Employee Name    : " + employeeName);
        System.out.println("Basic Salary     : ₹" + basicSalary);
        System.out.println("Department       : " + department);
        System.out.println("Team Size        : " + teamSize);
        System.out.println("Project Name     : " + projectName);
        System.out.println("Project Duration : " + projectDuration + " months");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager(101, "Neha Gupta", 120000, "IT", 10, "AI Portal", 12);
        pm.displayDetails();
    }
}
}
