package org.denhez.designpattern.chainofresponsibility.solution;

public class BinaryOp implements Expr {

    private final Operator operator;
    private final Expr left, right;

    public BinaryOp(Operator operator, Expr left, Expr right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }
}
