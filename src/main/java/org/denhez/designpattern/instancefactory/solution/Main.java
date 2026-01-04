package org.denhez.designpattern.instancefactory.solution;

import java.util.List;

import static org.denhez.designpattern.instancefactory.solution.VehicleFactory.*;


public class Main {

    public static void main(String ...args) {
        List<Vehicle> redCars = create5(partial(Car::new, "RED"));
        System.out.println(redCars);
    }
}
