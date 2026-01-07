package org.denhez.designpattern.state.solution.badexample;

import java.util.function.Consumer;

public class ChattyLogger implements Logger {

    private final Consumer<String> printer;

    public ChattyLogger(Consumer<String> printer) {
        this.printer = printer;
    }

    @Override
    public void error(String msg) {
        printer.accept(msg);
    }

    @Override
    public void warning(String msg) {
        printer.accept(msg);
    }

    @Override
    public Logger quiet() {
        return new QuietLogger(printer);
    }

    @Override
    public Logger chatty() {
        return this;
    }
}
