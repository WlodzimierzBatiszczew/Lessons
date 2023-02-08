package Lessons0102.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorOperation calculatorOperation  = new CalculatorOperation();

        int a = 1;
        int b= 1;
        int resultOfSum = calculatorOperation.sum (a,b);
        System.out.println(resultOfSum);

        int result2 = calculatorOperation.sum( 10, 35);
        System.out.println(result2);

        int resultOfSubtraction = calculatorOperation.minus(55, 15);
        int resultOfSubtraction2 = calculatorOperation.minus(a, b);
        System.out.println(resultOfSubtraction);
        System.out.println(resultOfSubtraction2);

        int resultOfMultiplication = calculatorOperation.multiplication(a, b);
        System.out.println(resultOfMultiplication);

        double resultOfDiv = calculatorOperation.div(a, b);
       // System.out.println(resultOfDiv);



    }
}
