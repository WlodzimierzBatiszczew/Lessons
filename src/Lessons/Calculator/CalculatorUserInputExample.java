package Lessons0102.Calculator;

public class CalculatorUserInputExample {
    public static void main(String[] args) {
        UserInput UserInput = new UserInput();
        CalculatorOperation calculatorOperations = new CalculatorOperation();

        System.out.println("Please enter first integer number - ");
        int x = UserInput.userInputInteger();
        System.out.println("Please enter second integer number - ");
        int y = UserInput.userInputInteger();
        int sumOfNumbers = calculatorOperations.sum(x, y);
       // System.out.println("Sum of numbers is " + calculatorOperations.sum(x, y));
        System.out.println("Sum of numbers is " + sumOfNumbers);

        System.out.println("Please enter first number - ");
        double xDouble = UserInput.userInputDouble();
        System.out.println("Please enter second number - ");
        double yDouble = UserInput.userInputDouble();
        double divOfNumbersDouble = calculatorOperations.div(x, y);
        // System.out.println("Sum of numbers is " + calculatorOperations.sum(x, y));
        System.out.println("Division of numbers is " + divOfNumbersDouble);


    }
}
