package lesson2;

import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Can you enter number1 and number2");
        int number1 = myObj.nextInt();
        int number2 = myObj.nextInt();
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);


    }
}
