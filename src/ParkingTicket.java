import java.lang.Math;

public class ParkingTicket {

     // initialFine = 25 dollar fine is issued for overtime parking
     // hourlyFine = 10 dollar is added to the total fine for every started hour of overtime parking
    final private static int initialFine = 25;
    final private static int hourlyFine = 10;

    public ParkingTicket() {

    }

    /**
     * @param boughtMinutes = the amount of parking minutes a car has purchased
     * @param passedMinutes = the amount of total minutes that passed since ticket purchase
     * @return total fine amount
     */
    public int calculateFine(ParkedCar boughtMinutes, ParkingMeter passedMinutes)
    {
        // Minimum fine is 25 dollars
        int fine = initialFine;

        // 10 dollars will be added to the total fine for each started hour (e.g. 2 hours and 10 minutes
        // will add 3 hours of extra fine to the total
        double additionalFine =
                Math.ceil((passedMinutes.getParkingTime() - boughtMinutes.getParkingMinutes()) / 60.0) * hourlyFine;

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
