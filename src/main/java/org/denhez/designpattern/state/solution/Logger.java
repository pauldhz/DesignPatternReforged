package org.denhez.designpattern.state.solution;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import static java.util.function.UnaryOperator.identity;

public class Logger {
    private final Consumer<String> error, warning;
    private final Logger quiet, chatty;

    public Logger(Consumer<String> error, Consumer<String> warning, UnaryOperator<Logger> quietFactory, UnaryOperator<Logger> chattyFactory) {

        this.error = error;
        this.warning = warning;
        this.quiet = quietFactory.apply(this);
        this.chatty = chattyFactory.apply(this);
    }

    public void error(String msg) {
        this.error.accept(msg);
    }

    public void warning(String msg) {
        this.warning.accept(msg);
    }

    public Logger quiet() {return this.quiet; }
    public Logger chatty() {return this.chatty; }

    public static Logger logger(Consumer<String> consumer) {
        Objects.requireNonNull(consumer);
        return new Logger(consumer, consumer,
                chatty -> new Logger(consumer, msg -> {}, identity(), it -> chatty), identity());
    }
}
