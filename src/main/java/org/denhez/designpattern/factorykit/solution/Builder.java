package org.denhez.designpattern.factorykit.solution;


import java.util.function.Supplier;

public interface Builder {

    void register(String name, Supplier<Vehicle> factory);
}
