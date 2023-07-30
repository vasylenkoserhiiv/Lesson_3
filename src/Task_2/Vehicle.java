package Task_2;
/*
Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден
(ціна, швидкість, рік випуску). Створіть 3 похідних класи Plane, Саг та Ship. Для класу
Plane має бути визначена висота та кількість пасажирів. Для класу Ship – кількість пасажирів та порт приписки.
Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
 */
public class Vehicle {
    private double latitude;
    private double longitude;
    private double price;
    private int speed;
    private int year;

    public Vehicle(double latitude, double longitude, double price, int speed, int year){
        this.latitude = latitude;
        this.longitude = longitude;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("Coordinates: (" + latitude + ", " + longitude + ")");
        System.out.println("Price: " + price + "$");
        System.out.println("Speed: " + speed + " m/h");
        System.out.println("Year of manufacture: " + year);
    }

}
