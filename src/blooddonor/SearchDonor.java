package blooddonor;
import java.util.Scanner;
public class SearchDonor {
	public static void search(Scanner sc) {

        String group = InputValidation.readBloodGroup(sc);

        boolean found = false;

        System.out.println("\n--- SEARCH RESULTS ---");

        for (Donor d : DonorStore.donorList) {

            if (d.bloodGroup.equalsIgnoreCase(group)) {

                System.out.println("ID: " + d.donorId);
                System.out.println("Name: " + d.name);
                System.out.println("Blood Group: " + d.bloodGroup);
                System.out.println("Location: " + d.location);

                found = true;
            }
        }

        if (!found) {
            System.out.println("No donors found for " + group);
        }
    }
}
