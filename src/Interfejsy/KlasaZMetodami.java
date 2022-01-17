package Interfejsy;

public class KlasaZMetodami implements Vehicle {

    @Override
    public void drive(int speed) {
        System.out.println("drive with speed " + speed);
    }

    @Override
    public void turn(String side) {
        System.out.println("turn to the side " + side);

    }

    @Override
    public void stop() {
        System.out.println( " stop !");

    }
}
