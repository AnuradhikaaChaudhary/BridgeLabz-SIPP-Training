package ObjectModeling;
import java.util.ArrayList;

class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println(c.name);
        }
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolandStudentswithCourses {
    public static void main(String[] args) {
        School school = new School("Springfield High");

        Student s1 = new Student("Tom");
        Student s2 = new Student("Jerry");

        Course math = new Course("Mathematics");
        Course sci = new Course("Science");

        s1.enrollCourse(math);
        s1.enrollCourse(sci);

        s2.enrollCourse(math);

        school.addStudent(s1);
        school.addStudent(s2);

        s1.showCourses();
        math.showStudents();
    }
}
