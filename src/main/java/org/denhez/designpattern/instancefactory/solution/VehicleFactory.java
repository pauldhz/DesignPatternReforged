package org.denhez.designpattern.instancefactory.solution;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public interface VehicleFactory {
    Vehicle create();

    static List<Vehicle> create5(Supplier<Vehicle> supplier) {
        return IntStream.range(0,5)
                .mapToObj(i -> supplier.get()).toList();
    }

    static <T,R> Supplier<R> partial(Function<T,R> function, T value) {
        return () -> function.apply(value);
    }

    Supplier<Vehicle> redCarFactory = () -> new Car("RED");
    Supplier<Vehicle> blueMotoFactory = () -> new Moto("BLUE");

}
