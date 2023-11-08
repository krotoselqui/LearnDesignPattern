package LearnPattern.AbstractFactory.Car;

public class Car {
    protected Tire tire;
    protected Handle handle;

    public void addTire(Tire tire) {
        this.tire = tire;
    }

    public void addHandle(Handle handle) {
        this.handle = handle;
    }
}
