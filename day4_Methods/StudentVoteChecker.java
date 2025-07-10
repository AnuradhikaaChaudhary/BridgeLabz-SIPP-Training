import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        StudentVoteChecker svc = new StudentVoteChecker();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean canVote = svc.canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote ");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote ");
            }
        }
    }

    
    public boolean canStudentVote(int age) {
        if (age < 0) {
            System.out.println("Invalid age entered.");
            return false;
        } else {
            return age >= 18;
        }
    }
}
