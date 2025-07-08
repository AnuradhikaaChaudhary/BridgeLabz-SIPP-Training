package JavaConstructors;

public class Course {
    
    String courseName;
    int duration; 
    double fee;

    
    static String instituteName = "Tech Academy";

    
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    
    public void displayCourseDetails() {
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration (wks) : " + duration);
        System.out.println("Fee            : Rs. " + fee);
        System.out.println("Institute      : " + instituteName);
    }

   
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 8, 8000.0);
        Course c2 = new Course("Web Development", 10, 10000.0);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        System.out.println("\nUpdating institute name...");
        Course.updateInstituteName("Code Academy");

        System.out.println();
        c1.displayCourseDetails();
    }
}
