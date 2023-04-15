import AbstructDemo.Car;
import AbstructDemo.Vehicle;

public class Abstractmain {
    public static void main(String[] args) {
        Vehicle vehicle= new Car();
        vehicle.move();
        vehicle.show();
    }
}
