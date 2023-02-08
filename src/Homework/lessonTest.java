package Youtube;


import java.util.Scanner;

public class lessonYouTube {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your name");
        String name1 = scanner1.next();
        System.out.println("Enter surname");
        String surname1 = scanner1.next();
        System.out.println("Enter age");
        int age1 = scanner1.nextInt();
        scanner1 = new Scanner(System.in);
        System.out.println(" Your hobbies");
        String hobbies1 = scanner1.nextLine();
        System.out.println("Name - " + name1 );
        System.out.println("Surname - "+ surname1);
        System.out.println("Age - "+ age1);
        System.out.println("Hobbies - "+ hobbies1);




//        System.out.println("Enter a sum USD");
//        double sumOfUSD = scanner1.nextDouble();
//        System.out.println("Enter a course USD to Euro");
//        double courseUSDToEuro = scanner1.nextDouble();
//        System.out.println("Amount in Euro " + sumOfUSD * courseUSDToEuro);




//        System.out.println("Enter a value");
//        int val = scanner1.nextInt();
//        System.out.println("val = " + val);


//        System.out.println("Enter first number");
//        int a = scanner1.nextInt();
//        System.out.println("Enter second number");
//        int b = scanner1.nextInt();
//        System.out.println("Enter third number");
//        int c = scanner1.nextInt();
//        System.out.println(a+" + "+b +" + " + c+ " ="+(a+b+c));



    }
}
