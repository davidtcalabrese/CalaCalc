package com.github.davidtcalabrese;
/** this class serves as a bluepring for a Calculator object - it contains
 * the method that do much of the programs actual work
 *
 * @author David Calabrese
 * 7/15/2021
 */
public class Calculator {
    /** this method performs simple addition
     *
     *  @param operandOne the first number entered into console by user
     *  @param operandTwo the second number entered into console by user
     *  @return a string representing the equation & its result
     */
    public String add(int operandOne, int operandTwo ) {
        int sum = operandOne + operandTwo;
        return operandOne + " + " + operandTwo + " equals " + sum;
    }

    /** this method performs simple subtraction
     *
     *  @param operandOne the first number entered into console by user
     *  @param operandTwo the second number entered into console by user
     *  @return a string representing the equation & its result
     */
    public String subtract(int operandOne, int operandTwo ) {
        int difference = operandOne - operandTwo;
        return operandOne + " - " + operandTwo + " equals " + difference;
    }

    /** this method performs simple multiplication
     *
     *  @param operandOne the first number entered into console by user
     *  @param operandTwo the second number entered into console by user
     *  @return a string representing the equation & its result
     */
    public String multiply(int operandOne, int operandTwo ) {
        double product = (double) operandOne * operandTwo;
        return operandOne + " * " + operandTwo + " equals " + product;
    }

    /** this method performs simple division
     *
     *  @param operandOne the first number entered into console by user
     *  @param operandTwo the second number entered into console by user
     *  @return a string representing the equation & its result
     */
    public String divide(int operandOne, int operandTwo ) {
        if (operandTwo == 0) {
            return "Can't divide by 0";
        } else {
            double quotient = (double) operandOne / operandTwo;
            return operandOne + " / " + operandTwo + " equals " + quotient;
        }
    }

    /** this method performs the modulo operation
     *
     *  @param operandOne the first number entered into console by user
     *  @param operandTwo the second number entered into console by user
     *  @return a string representing the equation & its result
     */
    public String getRemainder(int operandOne, int operandTwo) {
        double remainder = operandOne % operandTwo;
        return operandOne + " % " + operandTwo + " equals " + remainder;
    }


}
