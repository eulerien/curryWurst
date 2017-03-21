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
public interface CarBuilder {
    CarBuilder setWheels(final int wheels);

    CarBuilder setColor(final String color);
    
    CarBuilder setSteeringWheel(final String side);

    Car build();
    
}
