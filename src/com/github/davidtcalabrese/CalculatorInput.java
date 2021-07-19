package com.github.davidtcalabrese;
/** this class serves as a blueprint for CalculatorInput objects
 * note: I was thinking that I needed to be able to pass the operator (a
 * String) and both operands (ints) to the CalcEngine's methods as an array
 * and since they are of different types this wasn't possible so I created
 * this class with instance variables representing the operator and operand
 *
 * I realize now this was probably not the best way to solve that problem,
 * though it does technically work
 *
 * @author David Calabrese
 * 7/15/2021
 */
public class CalculatorInput {
    private int operand;
    private String operator;

    /**
     * Gets the value of operand
     * @return value of operand
     */
    public int getOperand() {
        return operand;
    }

    /**
     * Sets the value operand
     * @param operand value of operand
     */
    public void setOperand(int operand) {
        this.operand = operand;
    }

    /**
     * Gets the value of operator
     * @return value of operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value operator
     * @param operator value of operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /** this method receives the inputted operator and verifies that is is
     * one that is recognized by this program
     *  @param operator represents the equation's arithmetic operator as String
     *  @return true if valid, otherwise false
     */
    public boolean validateOperator(String operator) {
        String[] validOperators = new String[]{"+", "-", "*", "/", "%"};

        for (String str : validOperators) {
            if (str.equals(operator)) {
                return true;
            }
        }
        System.out.println("Invalid operator: " + operator);
        return false;
    }

    /** this method receives the inputted operands as string and verifies
     * they are valid by attempting to parse each to an int
     * if it catches an exception, one or both operands are invalid
     *
     *  @param inputOne represents the equation's first operand
     *  @param inputTwo represents the equation's second operand
     *  @return true if valid, otherwise false
     */
    public boolean validateOperands(String inputOne, String inputTwo) {
          // validate that they are integers
        try {
            int operandOne = Integer.parseInt(inputOne);
            int operandTwo = Integer.parseInt(inputTwo);
        } catch (NumberFormatException e) {
//            e.printStackTrace();
            System.out.println("Number format exception: " + e.getMessage());
            return false;
        }
        return true;
    }

    /** this method receives raw user input as an array of Strings and parses
     *  it into values of types which can be handled by the CalcEngine
     *
     *  @param rawInput - an array of type String representing the user's raw
     *                 and unverified input
     *  @return an array of type CalculatorInput - the value at index 0
     *  is the first operand, the value at index 1 is the operator and the
     *  value at index 2 is the second operand
     */
    public CalculatorInput[] parseInput(String[] rawInput) {
        CalculatorInput inputOne = new CalculatorInput();
        CalculatorInput inputTwo = new CalculatorInput();
        CalculatorInput operator = new CalculatorInput();

        // convert from strings to ints and store as inputOne & inputTwo
        inputOne.setOperand(Integer.parseInt(rawInput[0]));
        inputTwo.setOperand(Integer.parseInt(rawInput[2]));
        operator.setOperator(rawInput[1]);

        // store as array of CalculatorInput so it can be passed to
        CalculatorInput[] parsedInput = new CalculatorInput[3];
        parsedInput[0] = inputOne;
        parsedInput[2] = inputTwo;
        parsedInput[1] = operator;

        return parsedInput;
    }
}
