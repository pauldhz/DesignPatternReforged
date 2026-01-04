package org.denhez.designpattern.factorykit.solution;

public class Main {

    public static void main(String ...args) {
        VehicleFactory vehicleFactory = VehicleFactory.factory(builder -> {
            builder.register("Car", Car::new);
            builder.register("Moto", Moto::new);
        });
        Vehicle vehicle = vehicleFactory.create("Car");
        System.out.println(vehicle);
    }
}
