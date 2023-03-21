package inheritanceDemo;

public class Bicycle {
    protected int speed;
    protected int gear;

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public void increaseGear(int newValue) {
        this.gear = newValue;
    }

    public void applyBreak(int decreament) {
        this.speed = speed - decreament;
    }

    public void speedUp(int increament) {
        this.speed = speed + increament;
    }
}
