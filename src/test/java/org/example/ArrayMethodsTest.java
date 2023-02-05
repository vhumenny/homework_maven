package org.example;

import library.ArrayMethods;
import logger.Logger;
import logger.stdOutLogger.StdoutLogger;
import logger.stdOutLogger.StdoutLoggerConfigurationLoader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {
    String path = "src/main/java/logger/configuration/logging.properties";
    Logger logger = new StdoutLogger(new StdoutLoggerConfigurationLoader().load(path));

    ArrayMethods arrayMethods;

    @BeforeEach
    public void beforeEachTestMethod() {
        arrayMethods = new ArrayMethods();
    }

    @Test
    public void testReturnDigitsArrayFromFour_IfArrayDoesNotContainFour_ThrowsRuntimeException() {
        int[] array = new int[]{1, 2, 2, 2, 1};
        String expectedExceptionMethod = "Number 4 not found in array";
        RuntimeException actualException = assertThrows(RuntimeException.class, () ->
                        arrayMethods.returnDigitsArrayFromFour(array),
                "Array doesn't contain 4, then method should throw RuntimeException");
        assertEquals(expectedExceptionMethod, actualException.getMessage());
        logger.info(getClass().getSimpleName() + " : " + " Method: testReturnDigitsArrayFromFour_" +
                "IfArrayDoesNotContainFour_ThrowsRuntimeException - " + Arrays.toString(array) + " Expected result: -> "
                + expectedExceptionMethod + "; Actual result: ->" + actualException.getMessage());
    }

    @Test
    public void testReturnDigitsArrayFromFour_IfArrayContainsFour() {
        int[] array = new int[]{1, 2, 2, 4, 1};
        int[] expectedResult = new int[]{1};
        int[] actualResult = arrayMethods.returnDigitsArrayFromFour(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
        logger.info(getClass().getSimpleName() + " : " + "Method: testReturnDigitsArrayFromFour_" +
                "IfArrayContainsFour - " + Arrays.toString(array) + " Expected result: -> "
                + Arrays.toString(expectedResult) + "; Actual result: ->" + Arrays.toString(actualResult));
    }

    @Test
    public void testReturnDigitsArrayFromFour_IfFourPlacedFirstInArray() {
        int[] array = new int[]{4, 2, 2, 7, 1};
        int[] expectedResult = new int[]{2, 2, 7, 1};
        int[] actualResult = arrayMethods.returnDigitsArrayFromFour(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
        logger.info(getClass().getSimpleName() + " : " + "Method: testReturnDigitsArrayFromFour_" +
                "IfFourPlacedFirstInArray - " + Arrays.toString(array) + " Expected result: -> "
                + Arrays.toString(expectedResult) + "; Actual result: ->" + Arrays.toString(actualResult));
    }

    @Test
    public void testCheckIfArrayContainsOneAndFour_IfArrayContainsOneAndFour() {
        Integer[] array = new Integer[]{4, 2, 2, 7, 1};
        boolean expectedResult = true;
        boolean actualResult = arrayMethods.checkIfArrayContainsOneAndFour(array);
        assertEquals(expectedResult, actualResult);
        logger.info(getClass().getSimpleName() + " : " + "Method: testCheckIfArrayContainsOneAndFour_" +
                "IfArrayContainsOneAndFour - " + Arrays.toString(array) + " Expected result: -> " + expectedResult +
                "; Actual result: ->" + actualResult);
    }

    @Test
    public void testCheckIfArrayContainsOneAndFour_IfArrayContainsOnlyOne() {
        Integer[] array = new Integer[]{5, 2, 2, 7, 1};
        boolean expectedResult = false;
        boolean actualResult = arrayMethods.checkIfArrayContainsOneAndFour(array);
        assertEquals(expectedResult, actualResult);
        logger.info(getClass().getSimpleName() + " : " + "Method: testCheckIfArrayContainsOneAndFour_" +
                "IfArrayContainsOnlyOne - " + Arrays.toString(array) + " Expected result: -> " + expectedResult +
                "; Actual result: ->" + actualResult);
    }

    @Test
    public void testCheckIfArrayContainsOneAndFour_IfArrayContainsOnlyFour() {
        Integer[] array = new Integer[]{5, 4, 2, 7, 9};
        boolean expectedResult = false;
        boolean actualResult = arrayMethods.checkIfArrayContainsOneAndFour(array);
        assertEquals(expectedResult, actualResult);
        logger.info(getClass().getSimpleName() + " : " + "Method: testCheckIfArrayContainsOneAndFour_" +
                "IfArrayContainsOnlyFour" + Arrays.toString(array) + " Expected result: -> " + expectedResult +
                "; Actual result: ->" + actualResult);
    }

    @Test
    public void testCheckIfArrayContainsOneAndFour_IfArrayIsEmpty() {
        Integer[] array = new Integer[]{};
        boolean expectedResult = false;
        boolean actualResult = arrayMethods.checkIfArrayContainsOneAndFour(array);
        assertEquals(expectedResult, actualResult);
        logger.info(getClass().getSimpleName() + " : " + "Method: testCheckIfArrayContainsOneAndFour_" +
                "IfArrayIsEmpty" + Arrays.toString(array) + " Expected result: -> " + expectedResult +
                "; Actual result: ->" + actualResult);
    }
}