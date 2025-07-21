package Day2_StackAndQueue;

public class CircularTour {

    static class PetrolPump {
        int petrol, distance;

        PetrolPump(int p, int d) {
            petrol = p;
            distance = d;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {
        int totalSurplus = 0, currSurplus = 0, start = 0;

        for (int i = 0; i < pumps.length; i++) {
            int gain = pumps[i].petrol - pumps[i].distance;
            totalSurplus += gain;
            currSurplus += gain;

            if (currSurplus < 0) {
                start = i + 1;
                currSurplus = 0;
            }
        }
        return totalSurplus >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };
        System.out.println("Start at: " + findStartingPoint(pumps)); 
    }
}
