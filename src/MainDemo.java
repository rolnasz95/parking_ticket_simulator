import java.util.Scanner;

public class MainDemo {

    public static void main(String[] args) {

        int passedTime = getPassedTime();
        int carPassedTime = getCarTime();

        ParkingMeter timePassed = new ParkingMeter( passedTime );
        ParkedCar car = new ParkedCar("Toyota", "Camry", "White", "8FHK658", carPassedTime );
        PoliceOfficer officer = new PoliceOfficer("Mr. T", "6736771");

        boolean checkFine = officer.checkParking(car, timePassed);

        if (checkFine)
        {
            ParkingTicket ticket = new ParkingTicket();

            ticket.reportCar(car);
            ticket.reportOfficer(officer);
            int totalFine = ticket.calculateFine(car, timePassed);

            System.out.println("Total fines issued: $" + totalFine);
        }
        else
        {
            System.out.println("Car is within time limit. No fines were issued!");
        }
    }

    public static int getPassedTime()
    {
        System.out.print("Enter amount of minutes passed since ticket purchase: ");
        Scanner keyboard = new Scanner(System.in);
        int time = keyboard.nextInt();

        return time;
    }

    public static int getCarTime()
    {
        System.out.print("Enter amount of minutes the car has purchased: ");
        Scanner keyboard = new Scanner(System.in);
        int time = keyboard.nextInt();

        return time;
    }
}
