package org.denhez.designpattern.chainofresponsibility.solution;

public class Variable implements Expr {

    private final String name;

    public Variable(String name) {
        this.name = name;
    }
}
