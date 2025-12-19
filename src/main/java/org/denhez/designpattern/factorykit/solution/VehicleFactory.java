package org.denhez.designpattern.factorykit.solution;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface VehicleFactory {
    Vehicle create(String name);

    static VehicleFactory factory(Consumer<VehicleFactoryBuilder> consumer) {
        HashMap<String, Supplier<Vehicle>> map = new HashMap<>();
        consumer.accept(map::put);
        return name -> map.getOrDefault(name, () -> {throw new RuntimeException();}).get();
    }
}
