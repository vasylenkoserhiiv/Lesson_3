package Task_2;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(48.858844, 2.294351, 1000000, 900, 2019, 12000, 150);
        System.out.println("Plane Information:");
        plane.displayInfo();
        System.out.println();

        Car car = new Car(40.712776, -74.005974, 50000, 200, 2022, "Toyota Camry");
        System.out.println("Car Information:");
        car.displayInfo();
        System.out.println();

        Ship ship = new Ship(48.856613, 2.352222, 800000, 50, 2020,"Port of Marseille" , 500);
        System.out.println("Ship Information:");
        ship.displayInfo();
    }
}
