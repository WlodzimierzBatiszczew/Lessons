package Lessons0102.Calculator;

public class CalculatorOperation {

    public int sum(int x, int y){
        int sumOfBothParameters = x + y;
       // System.out.println(sumOfBothParameters * 10);
       return sumOfBothParameters;
    }



    public int minus(int parametr1, int parametr2){
        int resultOfSubtraction = parametr1 - parametr2;
        return resultOfSubtraction;
    }

   // public int multiplication(int parametr1, int parametr2){
     //   int resultOfSubtraction = parametr1 * parametr2;
       // return resultOfSubtraction;
   // }

    public int multiplication(int parametr1, int parametr2){
        int resultOfMultiplication = parametr1 * parametr2;
        return resultOfMultiplication;
    }
    public double div(double parametr1, double parametr2){
        double resultOfDiv = (double) parametr1 / (double) parametr2;
        //System.out.println(resultOfDiv * 3);
        return resultOfDiv;
    }






}
