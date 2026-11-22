package blooddonor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== BLOOD DONOR MANAGEMENT SYSTEM =====");
            System.out.println("1. Register Donor");
            System.out.println("2. Display Donors");
            System.out.println("3. Search by Blood Group");
            System.out.println("4. Filter by Group and Location");
            System.out.println("5. Record Donation History");
            System.out.println("6. Check Eligible Donors");
            System.out.println("7. Blood Group Donor Count");
            System.out.println("0. Exit");

            choice = InputValidation.readInt(sc, "Enter choice: ");

            switch (choice) {

                case 1:
                    RegisterDonor.register(sc);
                    break;

                case 2:
                    DisplayDonor.display();
                    break;

                case 3:
                    SearchDonor.search(sc);
                    break;

                case 4:
                    FilterDonor.filter(sc);
                    break;

                case 5:
                    DonationHistory.record(sc);
                    break;

                case 6:
                    EligibleDonors.displayEligible(sc);
                    break;

                case 7:
                    BloodGroupCount.displayCount();
                    break;

                case 0:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid menu choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}