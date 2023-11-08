package LearnPattern.AbstractFactory.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.addTire(new CarTire());
        car.addHandle(new CarHandle());
    }
}
