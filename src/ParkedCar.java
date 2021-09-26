public class ParkedCar {

    private String make;
    private String model;
    private String color;
    private String licensePlate;
    private ParkingMeter parkingMinutes;

    public ParkedCar(String make, String model, String color, String licensePlate, int parkingMinutes) {

        this.make = make;
        this.model = model;
        this.color = color;
        this.licensePlate = licensePlate;
        this.parkingMinutes = new ParkingMeter(parkingMinutes);

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getParkingMinutes() {
        return parkingMinutes.getParkingTime();
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setLicensePlate(String licensePlate)
    {
        this.licensePlate = licensePlate;
    }

    public void setParkingMinutes(int parkingMinutes)
    {
        this.parkingMinutes = new ParkingMeter(parkingMinutes);
    }
}
