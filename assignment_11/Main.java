public class Main {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Aarav Sharma", "Computer Science", 20);

        System.out.println("--- Default Constructor ---");
        s1.displayDetails();
        
        System.out.println("\n--- Parameterized Constructor ---");
        s2.displayDetails();
    }
}
