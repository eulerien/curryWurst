package ch.comem.fab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dylan
 */
public class Car {
    private int wheels;
    private String color;
    private String SteeringWheel;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car [wheels = " + wheels + ", color = " + color + ", steeringWheel = "+SteeringWheel+"]";
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(final int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public String getSteeringWheel() {
        return SteeringWheel;
    }

    public void setSteeringWheel(String SteeringWheel) {
        this.SteeringWheel = SteeringWheel;
    }
    
}
