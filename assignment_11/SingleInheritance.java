// Question 3.

public class SingleInheritance {

class Person {
    protected String name;
    protected int age;
    protected String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void displayPersonDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Email : " + email);
    }
}

class StudentPerson extends Person {
    private int studentId;
    private String course;

    public StudentPerson(String name, int age, String email, int studentId, String course) {
        super(name, age, email);
        this.studentId = studentId;
        this.course = course;
    }

    public void displayStudentDetails() {
        super.displayPersonDetails();
        System.out.println("Student ID : " + studentId);
        System.out.println("Course     : " + course);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        StudentPerson s = new StudentPerson("Rohan Verma", 21, "rohan@example.com", 202401, "CSE");
        s.displayStudentDetails();
    }
}
}
