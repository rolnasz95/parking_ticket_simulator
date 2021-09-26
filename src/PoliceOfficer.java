public class PoliceOfficer {

    private String officer;
    private String badge;

    public PoliceOfficer(String officer, String badge) {
        this.officer = officer;
        this.badge = badge;
    }

    public String getOfficer() {
        return officer;
    }

    public String getBadge() {
        return badge;
    }

    public boolean checkParking(ParkedCar car, ParkingMeter time) {
        boolean expired = false;

        if (car.getParkingMinutes() < time.getParkingTime())
        {
            expired = true;
        }

        return expired;
    }
}
