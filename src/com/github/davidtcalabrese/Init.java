package com.github.davidtcalabrese;

/** this class serves as a blueprint for an init object, which coordinates
 * all of the programs classes
 *
 * @author David Calabrese
 * 7/15/2021
 */
public class Init {
    /** this is a controller method which instantiates several objects,
     * outputs an initial greeting to user and then coordinates the other
     * classes of the calculator program as long as user continues to enter data
     */
    public static void run() {
        // instantiate Prompter, CalcEngine & CalculatorInput classes
        Prompter prompter = new Prompter();
        CalcEngine calcEngine = new CalcEngine();
        CalculatorInput calculatorInput = new CalculatorInput();

        // initial greeting
        prompter.sayHello();

        while (prompter.askToCalculate()) {
            // store input as strings in rawInput
            String[] rawInput = prompter.getInput();
            //  as long as this expression comes back true all input valid, so
            if (calculatorInput.validateOperands(rawInput[0], rawInput[2])
                    && calculatorInput.validateOperator(rawInput[1])) {
                // parse input
                CalculatorInput parsedInput = calculatorInput.parseInput(rawInput);
                // do the calculation
                calcEngine.runCalculator(parsedInput);
            }
        }
    }
}
