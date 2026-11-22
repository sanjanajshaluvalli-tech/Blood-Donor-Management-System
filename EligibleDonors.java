package blooddonor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EligibleDonors {

    public static void displayEligible(Scanner sc) {

        int interval = InputValidation.readInt(
                sc, "Enter minimum interval in days: ");

        if (interval < 0) {
            System.out.println("Interval cannot be negative!");
            return;
        }
        LocalDate today = LocalDate.now();

        boolean found = false;

        System.out.println("\n--- ELIGIBLE DONORS ---");

        for (Donor d : DonorStore.donorList) {

            boolean eligible = false;

            if (d.donationHistory.isEmpty()) {
                eligible = true;
            } else {
                LocalDate lastDonation =
                        d.donationHistory.get(0);

                for (LocalDate date : d.donationHistory) {
                    if (date.isAfter(lastDonation)) {
                        lastDonation = date;
                    }
                }

                long days = ChronoUnit.DAYS.between(
                        lastDonation, today);

                if (days >= interval) {
                    eligible = true;
                }
            }
            if (eligible) {
                System.out.println("ID: " + d.donorId);
                System.out.println("Name: " + d.name);
                System.out.println("Blood Group: " + d.bloodGroup);

                found = true;
            }
        }

        if (!found) {
            System.out.println("No eligible donors found!");
        }
    }
}
