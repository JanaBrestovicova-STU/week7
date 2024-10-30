// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("12345", "George", "Smith", 20);
        student.getInfo();  // Prints student information

        // Creating an Employee object
        Employee employee = new Employee("Anna", "Brown", 45);
        employee.getInfo();  // Prints employee information
    }
}