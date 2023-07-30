package Task_2;

public class Plane extends Vehicle {
    private double altitude;
    private int passengersCount;

    public Plane(double latitude, double longitude, double price, int speed, int year, double altitude,
                 int passengersCount) {
        super(latitude, longitude, price, speed, year);
        this.altitude = altitude;
        this.passengersCount = passengersCount;

    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Altitude: " + altitude + " m.");
        System.out.println("Passenger count: " + passengersCount);
    }


}
