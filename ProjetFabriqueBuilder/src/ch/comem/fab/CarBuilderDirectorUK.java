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
public class CarBuilderDirectorUK {
    private CarBuilder builder;

    public CarBuilderDirectorUK(final CarBuilder builder) {
        this.builder = builder;
    }

    public Car construct() {
        return builder.setWheels(4).setColor("Red").setSteeringWheel("Right").build();
    }
}
