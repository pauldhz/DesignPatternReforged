package org.denhez.designpattern.chainofresponsibility.solution;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.denhez.designpattern.chainofresponsibility.solution.Expr.*;

public class Main {

    final static List<String> list = Arrays.asList("+ 2 * a 3".split(" "));

    private static Expr create(Iterator<String> it) {
        return parse(it, token -> parseBinaryOp(token, () -> create(it))
                .or(() -> parseValue(token))
                .or(() -> parseVariable(token)));
    }
    public static void main(String ...args) {
        Expr expr = create(list.iterator());
        System.out.println(expr);
    }
}
