// Define the interface Person with a void method getInfo()
interface Person {
    void getInfo();  // Method to print information
}
class Student implements Person {

    private String studentID;
    private String name;
    private String surname;
    private int age;

    // Constructor for Student
    public Student(String studentID, String name, String surname, int age) {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Implementation of getInfo() that prints the student's information
    @Override
    public void getInfo() {
        System.out.println("Student Info:");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
class Employee implements Person {

    private String name;
    private String surname;
    private int age;

    // Constructor for Employee
    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Implementation of getInfo() that prints the employee's information
    @Override
    public void getInfo() {
        System.out.println("Employee Info:");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Years left until remote work: " + (62 - age));
        System.out.println();
    }
}