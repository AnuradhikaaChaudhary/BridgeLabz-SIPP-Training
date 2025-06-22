public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378; // in km
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double volumeMiles3 = volumeKm3 * 0.239913; // 1 km^3 = 0.239913 miles^3
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
