package KeyWords;


	class Patient {
	    
	    static String hospitalName = "City Hospital";

	    
	    private static int totalPatients = 0;

	    
	    private String name;
	    private int age;
	    private String ailment;
	    private final int patientID;  

	    
	    public Patient(String name, int age, String ailment) {
	        this.name = name;
	        this.age = age;
	        this.ailment = ailment;

	        
	        totalPatients++;
	        this.patientID = totalPatients;
	    }

	    
	    public static int getTotalPatients() {
	        return totalPatients;
	    }

	    
	    public void displayDetails() {
	        System.out.println("Hospital Name: " + hospitalName);
	        System.out.println("Patient ID: " + patientID);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Ailment: " + ailment);
	        System.out.println("---------------------------");
	    }
	}

	public class HospitalManagementSystem {
	    public static void main(String[] args) {
	        
	        Patient p1 = new Patient("Nikki", 30, "Fever");
	        Patient p2 = new Patient("Annu", 45, "Fracture");
	        Patient p3 = new Patient("Kannu", 28, "Allergy");

	        
	        if (p1 instanceof Patient) {
	            p1.displayDetails();
	        }

	        if (p2 instanceof Patient) {
	            p2.displayDetails();
	        }

	        if (p3 instanceof Patient) {
	            p3.displayDetails();
	        }

	        
	        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
	    }
	}



