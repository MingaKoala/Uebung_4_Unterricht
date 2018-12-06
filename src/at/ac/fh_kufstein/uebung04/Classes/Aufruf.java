package at.ac.fh_kufstein.uebung04.Classes;

public class Aufruf {
    public static void main(String[] args) {

        Car auto1= new Car();
        auto1.color = "Rot";
        auto1.wheels= 4;
        auto1.speed= 200.0;
        auto1.accelerate(80.0);
        auto1.slowdown(45.0);

        auto1.currentSpeed();

        auto1.getColor();
        auto1.getSpeed();
        auto1.getWheels();





    }
}
