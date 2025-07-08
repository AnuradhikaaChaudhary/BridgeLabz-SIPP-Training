package ObjectModeling;

import java.util.ArrayList;

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Dr. " + name + " is consulting patient " + p.name);
    }
}

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Hospital {
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }
}

public class HospitalDoctorsandPatients {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doc = new Doctor("Adams");
        Patient pat = new Patient("Charlie");

        hospital.addDoctor(doc);
        hospital.addPatient(pat);

        doc.consult(pat);
    }
}
