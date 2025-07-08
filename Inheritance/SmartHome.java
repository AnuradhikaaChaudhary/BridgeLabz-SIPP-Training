package Inheritance;


class Device {
 protected String deviceId;
 protected String status;

 Device(String deviceId, String status) {
     this.deviceId = deviceId;
     this.status = status;
 }

 void displayStatus() {
     System.out.println("Device ID: " + deviceId);
     System.out.println("Status: " + status);
 }
}

class Thermostat extends Device {
 private double temperatureSetting;

 Thermostat(String deviceId, String status, double temperatureSetting) {
     super(deviceId, status);
     this.temperatureSetting = temperatureSetting;
 }

 @Override
 void displayStatus() {
     super.displayStatus();
     System.out.println("Temperature Setting: " + temperatureSetting + "°C");
 }
}


public class SmartHome {
 public static void main(String[] args) {
     Thermostat livingRoomThermostat = new Thermostat(
         "TH-101",
         "Active",
         22.5
     );

     livingRoomThermostat.displayStatus();
 }
}
