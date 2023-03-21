package inheritanceDemo;

public class MountainBike extends Bicycle {
    protected int seatHeight;

    public MountainBike(int seatHeight, int speed, int gear) {
        super(speed, gear);
        this.seatHeight = seatHeight;
    }

    public void increaseHeight(int newSeatHeight) {
        seatHeight = seatHeight + newSeatHeight;
    }
}
