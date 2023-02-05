package org.example;

import library.MathLibrary;
import logger.Logger;
import logger.stdOutLogger.StdoutLogger;
import logger.stdOutLogger.StdoutLoggerConfigurationLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MathLibraryTest {
    MathLibrary mathLibrary;

    String path = "src/main/java/logger/configuration/logging.properties";
    Logger logger = new StdoutLogger(new StdoutLoggerConfigurationLoader().load(path));

    @BeforeEach
    public void beforeEachTestMethod() {
        mathLibrary = new MathLibrary();
    }

    @Test
    public void testAddPositiveNumbers() {
        double a = 1.1;
        double b = 1.2;
        double expectedResult = 2.30;
        double actualResult = mathLibrary.add(a, b);
        logger.info(getClass().getSimpleName() + " : " + " Method: testAddPositiveNumbers - " + a + " + "
                + b + " Expected result: -> " + expectedResult + "; Actual result: ->" + actualResult);
    }

    @Test
    public void testAddNegativeNumbers() {
        double a = -3.5;
        double b = -2.2;
        double expectedResult = -5.70;
        double actualResult = mathLibrary.add(a, b);
        logger.info(getClass().getSimpleName() + " : " + " Method: testAddNegativeNumbers - " + a + " + "
                + b + " Expected result: -> " + expectedResult + "; Actual result: ->" + actualResult);
    }

    @Test
    public void testAddBigNumbers() {
        double a = 1000.1;
        double b = 3400.2;
        double expectedResult = 4400.30;
        double actualResult = mathLibrary.add(a, b);
        logger.info(getClass().getSimpleName() + " : " + " Method: testAddBigNumbers - " + a + " + "
                + b + " Expected result: -> " + expectedResult + "; Actual result: ->" + actualResult);
    }

    @Test
    public void testAddZero() {
        double a = 1000.1;
        double b = 0;
        double expectedResult = 1000.10;
        double actualResult = mathLibrary.add(a, b);
        logger.info(getClass().getSimpleName() + " : " + " Method: testAddZero - " + a + " + "
                + b + " Expected result: -> " + expectedResult + "; Actual result: ->" + actualResult);
    }

    @Test
    public void testMinus() {
        double minuend = 1.1;
        double subtrahend = 2.2;
        double expectedResult = -1.1;
        double actualResult = mathLibrary.minus(minuend, subtrahend);
        logger.info(getClass().getSimpleName() + " : " + " Method: testMinus - " + minuend + " - "
                + subtrahend + " Expected result: -> " + expectedResult + "; Actual result: ->" + actualResult);
    }

    @Test
    public void testMinusNegativeNumbers() {
        double minuend = -5.1;
        double subtrahend = -10.1;
        double expectedResult = 5.0;
        double actualResult = mathLibrary.minus(minuend, subtrahend);
        logger.info(getClass().getSimpleName() + " : " + " Method: testMinusNegativeNumbers - " + minuend +
                " - " + subtrahend + " Expected result: -> " + expectedResult + "; Actual result: ->" + actualResult);
    }

    @Test
    public void testMinusBigNumbers() {
        double minuend = 540000.9;
        double subtrahend = 210000.4;
        double expectedResult = 330000.5;
        double actualResult = mathLibrary.minus(minuend, subtrahend);
        logger.info(getClass().getSimpleName() + " : " + " Method: testMinusBigNumbers - " + minuend +
                " - " + subtrahend + " Expected result: -> " + expectedResult + "; Actual result: ->" + actualResult);
    }

    @Test
    public void testMinusZero() {
        double minuend = 40.9;
        double subtrahend = 0;
        double expectedResult = 40.9;
        double actualResult = mathLibrary.minus(minuend, subtrahend);
        logger.info(getClass().getSimpleName() + " : " + " Method: testMinusZero - " + minuend +
                " - " + subtrahend + " Expected result: -> " + expectedResult + "; Actual result: ->" + actualResult);
    }

    @Test
    public void testMinusZeroAndTen() {
        double minuend = 0;
        double subtrahend = 10.9;
        double expectedResult = -10.9;
        double actualResult = mathLibrary.minus(minuend, subtrahend);
        logger.info(getClass().getSimpleName() + " : " + " Method: testMinusZeroAndTen - " + minuend +
                " - " + subtrahend + " Expected result: -> " + expectedResult + "; Actual result: ->" + actualResult);
    }
}