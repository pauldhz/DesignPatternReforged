package org.denhez;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        class Sum {
            int i = 0;
        }

        Sum sum = new Sum();
        Supplier<Integer> supplier = () -> ++sum.i;

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

    }
}