public class ParkingTicket {

    final private static int initialFine = 25;
    final private static int hourlyFine = 10;

    public ParkingTicket() {

    }

    public int calculateFine(ParkedCar boughtMinutes, ParkingMeter passedMinutes)
    {
        int fine = initialFine;

        double additionalFine = ((boughtMinutes.getParkingMinutes() - passedMinutes.getParkingTime()) / 60) * hourlyFine;

        fine += additionalFine;

        return fine;
    }

    public void reportCar(ParkedCar car) {
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("License plate: " + car.getLicensePlate());
    }

    public void reportOfficer(PoliceOfficer officer) {
        System.out.println("Issuing Officer's name: " + officer.getOfficer());
        System.out.println("Badge Number: " + officer.getBadge());
    }
}
