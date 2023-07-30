package Task_2;

public class Car extends Vehicle {
    private String model;

    public Car(double latitude, double longitude, double price, int speed, int year, String model){
        super(latitude, longitude, price, speed, year);
        this.model = model;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Model: " + model);

    }
}
