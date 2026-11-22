package blooddonor;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException

public class InputValidation {
    // Validate integer input
    public static int readInt(Scanner sc, String message) {

        while (true) {

            System.out.print(message);

            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }
    // Validate text input
    public static String readText(
            Scanner sc, String message) {

        while (true) {

            System.out.print(message);

            String value = sc.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println("Field cannot be empty!");
        }
    }
    // Validate blood group
    public static String readBloodGroup(Scanner sc) {

        String[] groups = {
            "A+", "A-", "B+", "B-",
            "AB+", "AB-", "O+", "O-"
        };

        while (true) {

            System.out.print("Enter Blood Group: ");

            String group = sc.nextLine().trim().toUpperCase();

            for (String validGroup : groups) {

                if (group.equals(validGroup)) {
                    return group;
                }
            }
            System.out.println("Invalid Blood Group! Try again.");
        }
    }

    // Validate phone number
    public static String readPhone(Scanner sc) {

        while (true) {

            System.out.print("Enter Contact Number: ");

            String phone = sc.nextLine().trim();

            if (phone.matches("[0-9]{10,15}")) {
                return phone;
                System.out.println("Invalid Blood Group! Try again.");
            }
        }
        // Validate donation date
        public static LocalDate readDate(Scanner sc) {

            while (true) {

                System.out.print(
                        "Enter Donation Date (YYYY-MM-DD): ");

                String date = sc.nextLine().trim();

                try {

                    LocalDate donationDate =
                            LocalDate.parse(date);

                    if (donationDate.isAfter(LocalDate.now())) {
                        System.out.println(
                                "Future dates are not allowed!");
                        continue;
                    }

                    return donationDate;

                } catch (DateTimeParseException e) {

                    System.out.println(
                            "Invalid date! Use YYYY-MM-DD.");
                }
            }
        }       
}
