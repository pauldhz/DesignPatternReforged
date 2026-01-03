package org.denhez.designpattern.chainofresponsibility.solution;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public interface Expr {
    static Optional<Expr> parseBinaryOp(String token, Supplier<Expr> supplier) {
        return Operator.parse(token).map(op -> new BinaryOp(op, supplier.get(), supplier.get()));
    }

    static Optional<Expr> parseValue(String token) {
        try {
            return Optional.of(new Value(Double.parseDouble(token)));
        }
        catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    static Optional<Expr> parseVariable(String token) {
        return Optional.of(new Variable(token));
    }

    static Expr parse(Iterator<String> it, Function<String, Optional<Expr>> factory) {
        String token = it.next();
        return factory.apply(token).orElseThrow(() -> new IllegalArgumentException("illegal token"));
    }
}
