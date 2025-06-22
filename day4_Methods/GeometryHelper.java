public class GeometryHelper {

   
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        double x1 = 2, y1 = 3;
        double x2 = 6, y2 = 11;

        double distance = findDistance(x1, y1, x2, y2);
        double[] equation = findLineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean Distance: %.2f\n", distance);
        System.out.printf("Equation of Line: y = %.2fx + %.2f\n", equation[0], equation[1]);
    }
}
