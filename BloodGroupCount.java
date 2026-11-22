package blooddonor;

public class BloodGroupCount {
    public static void displayCount() {

        String[] groups = {
            "A+", "A-", "B+", "B-",
            "AB+", "AB-", "O+", "O-"
        };

        System.out.println("\n--- BLOOD GROUP DONOR COUNT ---");

        for (String group : groups) {

            int count = 0;

            for (Donor d : DonorStore.donorList) {

                if (d.bloodGroup.equalsIgnoreCase(group)) {
                    count++;
                }
            }

            System.out.println(group + " : " + count);
        }
    }
}
