class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}
class Car extends Automobile {
    protected String drive() {
        return "Driving Car";
    }
}
public class ElectricCar extends Car {
    public final String drive() {
        return "Driving Electric Car";
    }
    public static void main(String[] wheels) {
        final Car car = new ElectricCar();
        System.out.println(car.drive());    // what will be the output ? 
    }
} 