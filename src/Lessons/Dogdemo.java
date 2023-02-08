package Lessons0102;

public class Dogdemo {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Bobik";
        dog1.age = 2;
        System.out.println(dog1.name);

        dog1.voice();

        String message1 = dog1.name;



        dog1.say(message1);


        Dog dog2 = new Dog();

        dog2.name = "Markus";
        dog2.age =4;
        dog2.voice();
        String message2 = dog2.name;
        dog2.say(message2);







    }
}
