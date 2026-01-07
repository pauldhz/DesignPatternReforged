package org.denhez.designpattern.state.solution.badexample;

import java.util.function.Consumer;

public interface Logger {

    void error(String msg);
    void warning(String msg);

    Logger quiet();
    Logger chatty();

    static Logger logger(Consumer<String> printer) {
        return null;
    }
}
