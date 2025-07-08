package ObjectModeling;

import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Department{
    String name;

    Department(String name) {
        this.name = name;
    }
}

class University {
    String name;
    ArrayList<Department> department = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartments(Department d) {
        department.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }
}

public class UniversitywithFacultiesandDepartments {
    public static void main(String[] args) {
        University uni = new University("Oxford University");

        Department cs = new Department("Computer Science");
        Department bio = new Department("Biology");

        Faculty profSmith = new Faculty("Prof. Smith");
        Faculty profJones = new Faculty("Prof. Jones");

        uni.addDepartments(cs);
        uni.addDepartments(bio);
        uni.addFaculty(profSmith);
        uni.addFaculty(profJones);

        System.out.println("University: " + uni.name);
        System.out.println("Departments:");
        for (Department d : uni.department) {
            System.out.println(d.name);
        }

        System.out.println("Faculties:");
        for (Faculty f : uni.faculties) {
            System.out.println(f.name);
        }
    }
}
