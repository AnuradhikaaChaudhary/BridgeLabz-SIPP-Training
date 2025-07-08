package KeyWords;

class Student {
    
    static String universityName = "ABC University";

    
    private static int totalStudents = 0;

    
    private String name;
    private final int rollNumber; 
    private String grade;

   
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    
    public void displayStudentDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("--------------------------");
    }

    
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        
        Student s1 = new Student("Anu", 101, "A");
        Student s2 = new Student("Nikki", 102, "B");

        
        if (s1 instanceof Student) {
            s1.displayStudentDetails();
            s1.updateGrade("A+");
            System.out.println("After updating grade:");
            s1.displayStudentDetails();
        }

        if (s2 instanceof Student) {
            s2.displayStudentDetails();
        }

        
        Student.displayTotalStudents();
    }
}
