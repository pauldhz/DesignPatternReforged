package org.denhez.designpattern.factorykit;

import java.util.function.Supplier;

public interface VehicleFactoryBuilder {

    void register(String name, Supplier<Vehicle> supplier);
}
