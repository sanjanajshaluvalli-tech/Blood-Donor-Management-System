package blooddonor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Donor {

    int donorId;
    String name;
    String bloodGroup;
    String contactDetails;
    String location;

    List<LocalDate> donationHistory = new ArrayList<>();

    public Donor(int donorId, String name, String bloodGroup,
                 String contactDetails, String location) {

        this.donorId = donorId;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.contactDetails = contactDetails;
        this.location = location;
    }
}