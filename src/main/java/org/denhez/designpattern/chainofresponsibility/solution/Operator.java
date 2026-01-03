package org.denhez.designpattern.chainofresponsibility.solution;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.toMap;

public enum Operator {

    ADD("+"), SUB("-"), MUL("*");

    Operator(String symbol) {
        this.symbol = symbol;
    }

    final String symbol;

    private static final Map<String, Operator> MAP = Arrays.stream(values()).collect(toMap(op -> op.symbol, op -> op));

    public static Optional<Operator> parse(String token) {
        return Optional.ofNullable(MAP.get(token));
    }
}
