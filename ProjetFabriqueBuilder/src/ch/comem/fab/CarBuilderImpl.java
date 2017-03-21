/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.comem.fab;

/**
 *
 * @author Dylan
 */
public class CarBuilderImpl implements CarBuilder{
     private Car car;

    public CarBuilderImpl() {
        car = new Car();
    }
    
    @Override
    public CarBuilder setSteeringWheel(final String side){
        car.setSteeringWheel(side);
        return this;
    }
    
    @Override
    public CarBuilder setWheels(final int wheels) {
        car.setWheels(wheels);
        return this;
    }

    @Override
    public CarBuilder setColor(final String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
