package lesson5;

import java.util.Scanner;

public class l5ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number");
        int baseNumber = input.nextInt();

        for ( int count=11; count<=132; count+=11 ){
            int result = baseNumber * count;
            System.out.print(baseNumber + " x "+count+ " = " +result);
        }

    }
}
