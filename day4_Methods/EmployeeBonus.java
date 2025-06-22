import java.util.Random;

public class EmployeeBonus {

    
    public static int[][] generateEmployeeData(int count) {
        Random rand = new Random();
        int[][] data = new int[count][2];

        for (int i = 0; i < count; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); 
            data[i][1] = rand.nextInt(11);            
        }

        return data;
    }

    
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] result = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }

        return result;
    }

    
    public static void displayTable(int[][] empData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-10s\n", "ID", "Salary", "Years", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < empData.length; i++) {
            int id = i + 1;
            int oldSalary = empData[i][0];
            int years = empData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            System.out.printf("%-5d %-10d %-10d %-10.2f %-10.2f\n", id, oldSalary, years, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("%-5s %-10.2f %-10s %-10.2f %-10.2f\n", "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] empData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(empData);
        displayTable(empData, bonusData);
    }
}
