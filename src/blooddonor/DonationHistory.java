package blooddonor;
import java.time.LocalDate;
import java.util.Scanner;
public class DonationHistory {
	public static void record(Scanner sc) {

        int id = InputValidation.readInt(
                sc, "Enter Donor ID: ");

        Donor selected = null;

        for (Donor d : DonorStore.donorList) {
            if (d.donorId == id) {
                selected = d;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Donor not found!");
            return;
        }

        LocalDate date = InputValidation.readDate(sc);

        selected.donationHistory.add(date);

        System.out.println("Donation date recorded successfully!");

        System.out.println("Donation History:");

        for (LocalDate donationDate : selected.donationHistory) {
            System.out.println(donationDate);
        }
    }

}
