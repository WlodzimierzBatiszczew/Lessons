package Homework.Homework120223;

import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {

        Scanner scanner10 = new Scanner(System.in);
        System.out.println("Введите первоначальную сумму на счету");
        int amountOfMoney = scanner10.nextInt();
        int firstAmount = amountOfMoney;
        int withdrawalAmount;
        int c = 0;
        int division = 0;
        int d = 1;
        int value = 0;
        int days = 0;
        int allWithdrawal = 0;
        System.out.println("Первоначальнас сумма на счету = " + firstAmount);

        while ( allWithdrawal < firstAmount) {
            value = 0;
            division = 1;
            c = 0;

            while (value <= amountOfMoney / 2) {
                c++;
                value++;
                d = amountOfMoney % c;
                if (d == 0) {
                    division = c;
                }
            }
            withdrawalAmount = division;
            if (amountOfMoney <= 3) {
                withdrawalAmount = 1;
            }
            amountOfMoney = amountOfMoney - withdrawalAmount;
            allWithdrawal = allWithdrawal + withdrawalAmount;
            days = days + 1;
            System.out.println("День " + days + ": Снято " + withdrawalAmount + "; Осталось " + amountOfMoney);

        }


    }
}
