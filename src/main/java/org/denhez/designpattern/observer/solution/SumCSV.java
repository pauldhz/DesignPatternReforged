package org.denhez.designpattern.observer.solution;

import java.io.IOException;
import java.nio.file.Path;

public class SumCSV {

    public double parseAndSum(Path path) throws IOException {
        class Adder { double sum; }
        Adder adder = new Adder();
        CSVParser.parse(path, value -> {adder.sum += value;});
        return adder.sum;
    }
}
