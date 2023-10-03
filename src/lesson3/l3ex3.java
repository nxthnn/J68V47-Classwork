package lesson3;

import java.util.Scanner;
public class l3ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        float L = scanner.nextFloat();

        System.out.print("Interest Rate: ");
        int rate = scanner.nextInt();

        System.out.print("Number of years to pay: ");
        int years = scanner.nextInt();

        float j = ((float) rate / 100)/12;
        int n = years * 12;
        float m = (float) (L * (j/ (1 - Math.pow((1+j),-n))));

        System.out.format("Monthly payments for this loan.... £%.2f",m);

    }
}