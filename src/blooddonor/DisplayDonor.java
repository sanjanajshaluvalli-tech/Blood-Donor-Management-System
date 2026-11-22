package blooddonor;

public class DisplayDonor {

    public static void display() {

        System.out.println("\n--- REGISTERED DONORS ---");

        if (DonorStore.donorList.isEmpty()) {
            System.out.println("No donors registered yet!");
            return;
        }

        for (Donor d : DonorStore.donorList) {

            System.out.println("----------------------");
            System.out.println("Donor ID: " + d.donorId);
            System.out.println("Name: " + d.name);
            System.out.println("Blood Group: " + d.bloodGroup);
            System.out.println("Contact: " + d.contactDetails);
            System.out.println("Location: " + d.location);
        }
    }
}