package ObjectModeling;
import java.util.ArrayList;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course c) {
        c.professor = this;
        System.out.println(name + " assigned to " + c.name);
    }
}

class Course {
    String name;
    Professor professor;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        c.addStudent(this);
        System.out.println(name + " enrolled in " + c.name);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Bob");
        Professor p1 = new Professor("Prof. Lee");
        Course c1 = new Course("Math 101");

        s1.enrollCourse(c1);
        p1.assignCourse(c1);
    }
}
