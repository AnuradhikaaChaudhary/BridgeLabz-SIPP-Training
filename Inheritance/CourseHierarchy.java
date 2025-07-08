package Inheritance;

class Course {
 protected String courseName;
 protected int duration; 


 public Course(String courseName, int duration) {
     this.courseName = courseName;
     this.duration = duration;
 }


 public void displayDetails() {
     System.out.println("Course Name: " + courseName);
     System.out.println("Duration: " + duration + " weeks");
 }
}


class OnlineCourse extends Course {
 protected String platform;
 protected boolean isRecorded;

 
 public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
     super(courseName, duration);
     this.platform = platform;
     this.isRecorded = isRecorded;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Platform: " + platform);
     System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
 }
}


class PaidOnlineCourse extends OnlineCourse {
 private double fee;
 private double discount; 

 public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
     super(courseName, duration, platform, isRecorded);
     this.fee = fee;
     this.discount = discount;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Fee: $" + fee);
     System.out.println("Discount: " + discount + "%");
     System.out.println("Fee After Discount: $" + getDiscountedFee());
 }

 private double getDiscountedFee() {
     return fee - (fee * discount / 100);
 }
}

public class CourseHierarchy {
 public static void main(String[] args) {
     
     Course course = new Course("Introduction to Programming", 8);

     OnlineCourse onlineCourse = new OnlineCourse("Java Fundamentals", 6, "Udemy", true);

     
     PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse(
             "Advanced Java Masterclass", 12, "Coursera", true, 499.99, 15.0);

     System.out.println("Basic Course ");
     course.displayDetails();

     System.out.println("Online Course ");
     onlineCourse.displayDetails();

     System.out.println(" Paid Online Course ");
     paidOnlineCourse.displayDetails();
 }
}
