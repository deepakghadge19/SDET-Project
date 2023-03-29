package inheritanceDemo;

public class InheritanceInvoke {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(5, 20, 1);
        System.out.println("Initial seat Height :" + mountainBike.seatHeight);
        System.out.println("Initial Bike Speed :" + mountainBike.speed);
        System.out.println("Initial Gear :" + mountainBike.gear);

        mountainBike.increaseHeight(1);
        System.out.println("New Seat Height :" + mountainBike.seatHeight);
        mountainBike.applyBreak(3);
        System.out.println("Speed after applying Break :" + mountainBike.speed);
        mountainBike.speedUp(1);
        System.out.println("Speed after increase the speed :" + mountainBike.speed);
    }
}
