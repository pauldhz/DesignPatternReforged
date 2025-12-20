package org.denhez.designpattern.observer.solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.DoubleConsumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CSVParser {
    public static void parse(Path path, DoubleConsumer observer) throws IOException {
        try (Stream<String> lines = Files.lines(path)) {
            lines.flatMap(Pattern.compile(";")::splitAsStream)
                    .mapToDouble(Double::parseDouble)
                    .forEach(observer);
        }
    }
}
