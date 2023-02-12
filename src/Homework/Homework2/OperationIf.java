package Homework.Homework2;

public class OperationIf {

    public static void main(String[] args) {

        //Can Walk

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk;
        if (isWeekend && !isRain) {
            canWalk = true;
        } else {
            canWalk = false;
        }
        System.out.println(canWalk);

       // Can Buy ----------------------------------------------------------------

        boolean isEdekaOpen = true;
        boolean isReweOpen = true;
        boolean canBuy;

        if (isEdekaOpen || isReweOpen) {
            canBuy = true;
        } else {
            canBuy = false;
        }
        System.out.println(canBuy);

        //Correct Work  -------------------------------------------------------------------

        int temperature1 = 80;
        int temperature2 = 120;
        boolean correctWork;
        if (temperature1 < 100 && temperature2 > 100) {
            correctWork = true;
        } else {
            correctWork = false;
        }
        System.out.println(correctWork);

    }
}

