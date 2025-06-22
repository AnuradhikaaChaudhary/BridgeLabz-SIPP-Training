public class LeapYearChecker {

    
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("Leap year check is only valid for years >= 1582.");
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
