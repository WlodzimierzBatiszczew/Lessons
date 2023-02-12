package Homework.Homework120223;

import java.util.Scanner;

public class ClockSeconds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество секунд оставшееся до конца рабочего дня, но не более 28800 секунд.");

        int seconds = scanner.nextInt();
        int hours;
        int minutes;
        int seconds2;
        int remainder;

        hours = seconds/3600;
        remainder = seconds - (hours*3600);
        minutes = remainder/60;
        seconds2 = remainder - (minutes*60);

        System.out.println("До конца рабочего дня осталось " + hours + " часов, " + minutes + " минут, " + seconds2 +  " секунд.");





    }
}
