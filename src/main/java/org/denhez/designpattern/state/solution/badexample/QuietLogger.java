package org.denhez.designpattern.state.solution.badexample;

import java.util.function.Consumer;

public class QuietLogger implements Logger {

    private final Consumer<String> printer;

    public QuietLogger(Consumer<String> printer) {
        this.printer = printer;
    }

    @Override
    public void error(String msg) {
        this.printer.accept(msg);
    }

    @Override
    public void warning(String msg) {
        // empty
    }

    @Override
    public Logger quiet() {
        return this;
    }

    @Override
    public Logger chatty() {
        return new ChattyLogger(printer);
    }
}
