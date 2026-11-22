package blooddonor;
import java.util.Scanner;
public class FilterDonor {
	 public static void filter(Scanner sc) {

	        String group = InputValidation.readBloodGroup(sc);

	        String location = InputValidation.readText(
	                sc, "Enter Location: ");

	        boolean found = false;

	        System.out.println("\n--- FILTERED DONORS ---");

	        for (Donor d : DonorStore.donorList) {

	            if (d.bloodGroup.equalsIgnoreCase(group)
	                    && d.location.equalsIgnoreCase(location)) {

	                System.out.println("ID: " + d.donorId);
	                System.out.println("Name: " + d.name);
	                System.out.println("Contact: " + d.contactDetails);

	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("No matching donors found!");
	        }
	    }
}
