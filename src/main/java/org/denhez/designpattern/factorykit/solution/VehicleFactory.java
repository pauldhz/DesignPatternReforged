package org.denhez.designpattern.factorykit.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface VehicleFactory {

    Vehicle create(String name);

    static VehicleFactory factory(Consumer<Builder> consumer) {
        final Map<String, Supplier<Vehicle>> map = new HashMap<>();
        consumer.accept(map::put);
        return name -> map.getOrDefault(name, () -> {throw new IllegalArgumentException();}).get();
    }
}
