package at.ac.fh_kufstein.uebung04.Classes;

import javax.swing.*;
import java.sql.SQLOutput;

public class Car {

    String color;
    int wheels;
    double speed;

    public void accelerate(double geschwindigkeit) {

        this.speed= geschwindigkeit +speed;

    }

    public void slowdown(double geschwindigkeit) {

        this.speed= speed - geschwindigkeit;

    }


    public double getSpeed() {
        return speed;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public void currentSpeed() {



        System.out.println(" Die Geschwindigkeit beträgt "  + speed);
    }



}
