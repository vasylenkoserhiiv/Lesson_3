package Task_2;

public class Ship extends Vehicle {
    public int passengersCount;
    private String port;


    public Ship(double latitude, double longitude, double price, int speed, int year, String port, int passengersCount) {
        super(latitude, longitude, price, speed, year);
        this.port = port;
        this.passengersCount = passengersCount;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Passenger count: " + passengersCount);
        System.out.println("Home port: " + port);
    }
}

