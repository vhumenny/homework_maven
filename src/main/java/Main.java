import library.MathLibrary;
import logger.Logger;
import logger.stdOutLogger.StdoutLogger;
import logger.stdOutLogger.StdoutLoggerConfigurationLoader;

import java.net.URI;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        start();
    }

    public static void start() {
        String path = "logging.properties";
        Logger logger = new StdoutLogger(new StdoutLoggerConfigurationLoader().
                load(Main.class.getResourceAsStream(path)));
        Scanner scanner = new Scanner(System.in);
        MathLibrary mathLibrary = new MathLibrary();
        logger.info("""
                Please choose math operation type.\s
                To choose add operation enter 'plus' .\s
                To choose subtract operation enter 'minus' .""");
        String line = scanner.nextLine();
        if (line.equals("plus")) {
            logger.info("enter argument1: ");
            int argument1 = Integer.parseInt(scanner.nextLine());
            logger.info("enter argument2: ");
            int argument2 = Integer.parseInt(scanner.nextLine());
            logger.info("Result of operation add: " + mathLibrary.add(argument1, argument2));
        } else if (line.equals("minus")) {
            logger.info("enter argument1: ");
            int argument1 = Integer.parseInt(scanner.nextLine());
            logger.info("enter argument2: ");
            int argument2 = Integer.parseInt(scanner.nextLine());
            logger.info("Result of operation minus: " + mathLibrary.minus(argument1, argument2));
        } else logger.info("you entered the wrong command!");

    }
}
