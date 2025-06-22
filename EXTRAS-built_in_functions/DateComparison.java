import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstInputDate = scanner.nextLine();
        
      
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondInputDate = scanner.nextLine();
        
        
        LocalDate firstDate = LocalDate.parse(firstInputDate, formatter);
        LocalDate secondDate = LocalDate.parse(secondInputDate, formatter);
        
        
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }
        
       
        scanner.close();
    }
}
