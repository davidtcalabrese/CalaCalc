package com.github.davidtcalabrese;

/** creates a blueprint for CalcEngine objects
 * each instance of CalcEngine stores an instance of Calculator
 * it contains a method which decides which calculator method to call
 *
 * @author David Calabrese
 * 7/13/2021
 */
public class CalcEngine {
    private Calculator calculator = new Calculator();

    /** this method takes an array of Calculator input objects, breaks it
     * down into its component parts
     *
     *  @param parsedInput
     */
    public void runCalculator(CalculatorInput[] parsedInput) {
        int operandOne = parsedInput[0].getOperand();
        int operandTwo = parsedInput[2].getOperand();
        String operator = parsedInput[1].getOperator();

        // depending on the operator, call correct calculator method and
        // print the returned value
        switch(operator) {
            case "+":
                System.out.println(calculator.add(operandOne, operandTwo));
                break;
            case "-":
                System.out.println(calculator.subtract(operandOne, operandTwo));
                break;
            case "*":
                System.out.println(calculator.multiply(operandOne, operandTwo));
                break;
            case "/":
                System.out.println(calculator.divide(operandOne, operandTwo));
                break;
            case "%":
                System.out.println(calculator.getRemainder(operandOne,
                        operandTwo));
                break;
        }
    }
}
