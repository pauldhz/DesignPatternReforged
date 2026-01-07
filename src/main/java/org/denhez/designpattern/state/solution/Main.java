package org.denhez.designpattern.state.solution;

public class Main {

    public static void main(String ...args) {
        Logger logger = Logger.logger(msg -> System.out.println("My msg : " + msg));
        logger.quiet().chatty().warning("Hello");
    }
}
