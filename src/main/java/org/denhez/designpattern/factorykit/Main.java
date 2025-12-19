package org.denhez.designpattern.factorykit;

public class Main {

    public static void main(String ...args) {
        VehicleFactory vehicleFactory = VehicleFactory.factory((vehicleFactoryBuilder) -> {
            vehicleFactoryBuilder.register("Moto", Moto::new);
            vehicleFactoryBuilder.register("Car", Car::new);
        });

        System.out.println(vehicleFactory.create("Moto"));
    }
}
