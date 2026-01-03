package org.denhez.designpattern.chainofresponsibility.solution;

public class Value implements Expr {

    private final double value;

    public Value(double value) {
        this.value = value;
    }
}
