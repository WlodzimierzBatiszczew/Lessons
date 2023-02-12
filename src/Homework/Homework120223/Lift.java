package Homework.Homework120223;

public class Lift {
    public static void main(String[] args) {

        int floor2 = 100;
        int intermediateFloor2 = 0;
        int stepUp2 = 50;
        int stepDown2 = 20;
        int numberOfLifts2 = 0;

        if (floor2 == 0) {
            System.out.println(" Количество подъемов равно " + numberOfLifts2 + ".");
        } else if (stepUp2 >=floor2 ) {

            numberOfLifts2++;
            intermediateFloor2 = stepUp2 * numberOfLifts2;
            System.out.println(" Количество подъемов равно " + numberOfLifts2 + ".");
        }
        else {
            numberOfLifts2 = 1;
            intermediateFloor2 = stepUp2 * numberOfLifts2;

            while (intermediateFloor2 < floor2) {
                numberOfLifts2++;

                intermediateFloor2 = intermediateFloor2 + (stepUp2 - stepDown2) * ((numberOfLifts2) - 1);
            }
            System.out.println(" Количество подъемов равно " + numberOfLifts2 + ".");
        }


    }
}
