import java.util.Scanner;

public class MainDemo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        ParkingMeter timePassed = new ParkingMeter( getPassedTime(keyboard) );
        ParkedCar car = new ParkedCar("Toyota", "Camry", "White", "8FHK658", getCarTime(keyboard) );
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

        keyboard.close();

        System.exit(0);
    }

    public static int getPassedTime(Scanner input)
    {
        System.out.print("Enter time passed in minutes since ticket purchase: ");
        int time = input.nextInt();

        return time;
    }

    public static int getCarTime(Scanner input)
    {
        System.out.print("Enter time in minutes the car has purchased: ");
        int time = input.nextInt();

        return time;
    }
}
