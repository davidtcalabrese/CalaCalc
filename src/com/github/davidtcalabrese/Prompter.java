package com.github.davidtcalabrese;
/**
 * This class serves as the blueprint for Prompter objects, which contain
 * utility functions for greeting the user and processing their input
 *
 * @author David Calabrese
 * 7/15/2021
 */
public class Prompter {
    // instantiate a new InputHelper object
    private InputHelper inputHelper = new InputHelper();

    /**
     * This method outputs an initial greeting to the user with instructions
     *  on how to use the program
     */
    public void sayHello() {
        System.out.println("Welcome to CalaCalc, a robust, state of the art,"
                + " command line application \nwhich performs five"
                + " basic arithmetic operations. \nNow featuring modulo! "
                + "\nInstructions: Type a number, then an operator, "
                + "then another number. \nChoose from the following operators: "
                + "\nFor addition: + "
                + "\nFor subtraction: - "
                + "\nFor multiplication: * "
                + "\nFor division: /"
                + "\nFor modulo operation: %"
                + "\nHit enter after typing each entry."
        );
    }

    /**
     * This is another utility method for getting input from user with help
     * of the InputHelper class
     *  @return an array of input for calculations
     */
    public String[] getInput() {
        String[] inputArray = new String[3];
        String userInput = null;
        String prompt = "";

        for (int i = 0; i < 3; i++) {
            // make prompt appropriate for context
            if (i == 0) {
                prompt = "Enter first operand: ";
            } else if (i == 1) {
                prompt = "Enter operator: ";
            } else if (i == 2) {
                prompt = "Enter second operand: ";
            }

            userInput = inputHelper.getUserInput(prompt);
            inputArray[i] = userInput;

        }
        return inputArray;
    }

    /**
     * This method works with the inputHelper class to ask the user if they
     * would like to use the calculator program or quit
     *
     *  @return true if program should continue to run, otherwise false
     */
    public boolean askToCalculate() {
        String signOff = "\n" +
"          __   ____  _       ____    __   ____  _        __  __ \n" +
"Thanks   /  ] /    || |     /    |  /  ] /    || |      /  ]|  |\n" +
"for     /  / |  o  || |    |  o  | /  / |  o  || |     /  / |  |\n" +
"using  /  /  |     || |___ |     |/  /  |     || |___ / /   |__|\n" +
"      /   \\_ |  _  ||     ||  _  /   \\_ |  _  ||     /   \\_  __ \n" +
"      \\     ||  |  ||     ||  |  \\     ||  |  ||     \\     ||  |\n" +
"       \\____||__|__||_____||__|__|\\____||__|__||_____|\\____||__|\n";

        String userInput;

        while (true) {
            userInput = inputHelper.getUserInput("\nWould you like to " +
                    "do a calculation? Enter \"y\" or \"n\":");
            if(userInput.equals("n")) {
                System.out.println(signOff);
                break;
            } else if (userInput.equals("y")) {
                return true;
            } else {
                System.out.println("Invalid entry.");
            }
        }
        return false;
    }
}
