package blooddonor;

import java.util.Scanner;

public class RegisterDonor {

    public static void register(Scanner sc) {

        System.out.println("\n--- DONOR REGISTRATION ---");

        int id;

        while (true) {
            id = InputValidation.readInt(sc, "Enter Donor ID: ");

            if (id <= 0) {
                System.out.println("ID must be positive!");
                continue;
            }

            boolean exists = false;

            for (Donor d : DonorStore.donorList) {
                if (d.donorId == id) {
                    exists = true;
                    break;
                }
            }

            if (!exists) break;

            System.out.println("Donor ID already exists!");
        }

        String name = InputValidation.readText(sc, "Enter Name: ");
        String group = InputValidation.readBloodGroup(sc);
        String contact = InputValidation.readPhone(sc);
        String location = InputValidation.readText(sc, "Enter Location: ");

        Donor d = new Donor(id, name, group, contact, location);

        DonorStore.donorList.add(d);

        System.out.println("Donor registered successfully!");
    }
}
