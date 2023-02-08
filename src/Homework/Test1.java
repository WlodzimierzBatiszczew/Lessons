package Youtube;

import java.util.Scanner;

public class Test1{
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(System.in);
        int a = scanner3.nextInt();
        int b = scanner3.nextInt();
        int c = scanner3.nextInt();
        Calculator2 calculator = new Calculator2();
        calculator.sum(a, b, c);




    }

}
class Calculator2{
    public void sum(int a, int b, int c){

        System.out.println(a + b + c);
    }
}