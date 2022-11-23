package parkingGarage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Garage {

    public ArrayList<Vehicle> slots = new ArrayList<Vehicle>();
    public ArrayList<Vehicle> park = new ArrayList<Vehicle>();

    public void parkVehicle() {
    }

    public void unParkVehicle() {
    }

    public void listVehicleByType() {
    }

    public void getVehicleByLicenseNum() {
    }

    public void initializeGarage() {
        Car car1 = new Car(2013, "Red", "HGR 594", 2);
        Car car2 = new Car(2017, "Gold", "LGE 563", 4);
        Airplane airplane1 = new Airplane(1956, "Black", "ASD 432", 2);
        Airplane airplane2 = new Airplane(1993, "Orange", "SGT 746", 2);
        Motorcycle motorcycle1 = new Motorcycle(2010, "Blue", "LKJ 872", 4);
        Motorcycle motorcycle2 = new Motorcycle(2022, "White", "MGJ 923", 2);
        Boat boat1 = new Boat(2010, "Blue", "OJF 321", 1);
        Boat boat2 = new Boat(1989, "Purple", "LAS 912", 2);
        slots.add(car1);
        slots.add(boat1);
        slots.add(airplane1);
        slots.add(motorcycle1);
        park.add(car2);
        park.add(boat2);
        park.add(airplane2);
        park.add(motorcycle2);
    }

    public void inputMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hej, Vad vill du göra?");
        System.out.println("Parkera fordon, tryck 1");
        System.out.println("Hämta fordon, tryck 2");
        System.out.println("Söka efter fordon med regnummer, tryck 3");
        System.out.println("Se vilka fordon som är inne i garaget, tryck 4");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Vilket fordon vill du parkera?");
            System.out.println(park);
            scanner.nextLine();
            System.out.println(scanner.nextLine());
            System.out.println("Fordonet är nu parkerat");
        }
        if (choice == 2) {
            System.out.println("Vilket fordon vill du hämta? ");
            System.out.println(slotsToString());
            scanner.nextLine();
            System.out.println("Vill du hämta: " +scanner.nextLine()+ "?");
            scanner.nextLine();
            System.out.println("Tack för du hämta din bil, välkommen åter!");


        }
        if (choice == 3) {
            System.out.println("Mata in regnummret:");
            scanner.nextLine();
            System.out.println(scanner.nextLine());
            System.out.println("Stämmer det? JA/NEJ");
            scanner.nextLine();


        }
        if (choice == 4) {
            System.out.println("Dessa fordon är parkerade i garaget just nu: " + slotsToString());
        }


    }

    // Skiver ut vilka regnummer på de fordon som är parkerade i garaget
    private String slotsToString() {
        String output = "";
        for (Vehicle vehicle : slots) {

            output += vehicle.licenseNum + " ,";

        }
        return output;
    }
    // Skriver ut regnummer om du vill parkera
    private String parkToString() {
        String output = "";
        for (Vehicle vehicle : park) {

            output += vehicle.licenseNum + " ,";

        }
        return output;
    }
    

}
