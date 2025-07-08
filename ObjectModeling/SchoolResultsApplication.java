package ObjectModeling;
import java.util.ArrayList;

class Subject {
    String name;
    int marks;

    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    ArrayList<Subject> subjects;

    Student(String name) {
        this.name = name;
        subjects = new ArrayList<>();
    }

    void addSubject(Subject s) {
        subjects.add(s);
    }

    void displaySubjects() {
        System.out.println("Subjects for " + name + ":");
        for (Subject s : subjects) {
            System.out.println("- " + s.name + ": " + s.marks);
        }
    }
}

class GradeCalculator {
    char calculateGrade(Student student) {
        int total = 0;
        for (Subject s : student.subjects) {
            total += s.marks;
        }
        int average = total / student.subjects.size();

        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else return 'D';
    }
}

public class SchoolResultsApplication {
    public static void main(String[] args) {
        
        Student student = new Student("Anu");
        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        student.addSubject(maths);
        student.addSubject(science);

        student.displaySubjects();

        GradeCalculator gc = new GradeCalculator();
        char grade = gc.calculateGrade(student);
        System.out.println(student.name + "'s Grade: " + grade);
    }
}
