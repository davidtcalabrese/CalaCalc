package com.github.davidtcalabrese;
/**
 * This class contains a main method which tests the 5 functions in the
 * Calculator class
 *
 * @author David Calabrese
 * 7/15/2021
 */

public class CalculatorTest {
    /**
     * This method instantiates a new calculator, stores into local variables
     * dummy data and the expected result of passing that dummy data into the
     * various methods of the Calculator class
     *
     * If the expected results match the actual results, it prints out a
     * message indicating that the tests have been passed.
     * If the expected results differ from the actual results, it indicates
     * that the method failed the tests.
     * Whether the method failed or passed the tests, the main() will print
     * out the actual and expected results for comparison
     *
     *  @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // instantiate new calculator object
        Calculator calculator = new Calculator();

        // set test input
        int testOperandOne = 50;
        int testOperandTwo = 9;

        // default test results
        String additionTestResult = "failed";
        String subtractionTestResult = "failed";
        String multiplicationTestResult = "failed";
        String divisionTestResult = "failed";
        String moduloTestResult = "failed";


        // ************************* addition test ***************************//
        // expected result from calculator.add
        String expectedAdditionResult = testOperandOne + " + "
                + testOperandTwo + " equals "
                + (testOperandOne + testOperandTwo);

        // actual result from calculator.add
        String actualSumResult = calculator.add(testOperandOne, testOperandTwo);

        if (actualSumResult.equals(expectedAdditionResult)) {
            additionTestResult = "passed";
        }

        // print out test results
        System.out.println("Addition test: " + additionTestResult);
        System.out.println("Expected result: " + expectedAdditionResult);
        System.out.println("Actual result: " + actualSumResult);


        // *********************** subtraction test **************************//
        // expected result from calculator.subtract
        String expectedDifferenceResult = testOperandOne + " - " +
                testOperandTwo + " equals " + (testOperandOne - testOperandTwo);

        // actual result from calculator.subtract
        String actualDifferenceResult = calculator
                .subtract(testOperandOne, testOperandTwo);

        if (actualDifferenceResult.equals(expectedDifferenceResult)) {
            subtractionTestResult = "passed";
        }

        // print out test results
        System.out.println("\nSubtraction test: " + subtractionTestResult);
        System.out.println("Expected result: " + expectedDifferenceResult);
        System.out.println("Actual result: " + actualDifferenceResult);


        // ********************* multiplication test *************************//
        // expected result from calculator.multiply
        String expectedMultiplicationResult = testOperandOne + " * "
                + testOperandTwo + " equals "
                + ((double) testOperandOne * testOperandTwo);

        // actual result from calculator.subtract
        String actualMultiplicationResult = calculator
                .multiply(testOperandOne, testOperandTwo);

        if (actualMultiplicationResult.equals(expectedMultiplicationResult)) {
            multiplicationTestResult = "passed";
        }

        // print out test results
        System.out.println("\nMultiplication test: " + multiplicationTestResult);
        System.out.println("Expected result: " + expectedMultiplicationResult);
        System.out.println("Actual result: " + actualMultiplicationResult);


        // ************************** division test **************************//
        // expected result from calculator.divide
        String expectedDivisionResult = testOperandOne + " / " +
                testOperandTwo + " equals "
                + ((double) testOperandOne / testOperandTwo);

        // actual result from calculator.subtract
        String actualDivisionResult = calculator
                .divide(testOperandOne, testOperandTwo);

        if (actualDivisionResult.equals(expectedDivisionResult)) {
            divisionTestResult = "passed";
        }

        System.out.println("\nDivision test: " + divisionTestResult);
        System.out.println("Expected result: " + expectedDivisionResult);
        System.out.println("Actual result: " + actualDivisionResult);


        // ************************** modulo test **************************//
        // expected result from calculator.divide
        String expectedModuloResult = testOperandOne + " % " +
                testOperandTwo + " equals "
                + ((double) testOperandOne % testOperandTwo);

        // actual result from calculator.subtract
        String actualModuloResult = calculator
                .getRemainder(testOperandOne, testOperandTwo);

        if (actualModuloResult.equals(expectedModuloResult)) {
            moduloTestResult = "passed";
        }

        // print out test results
        System.out.println("\nModulo test: " + moduloTestResult);
        System.out.println("Expected result: " + expectedModuloResult);
        System.out.println("Actual result: " + actualModuloResult);
    }
}
