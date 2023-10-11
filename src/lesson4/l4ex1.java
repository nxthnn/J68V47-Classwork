package lesson4;

import java.util.Scanner;
public class l4ex1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your firstname: ");
        String firstname = myObj.nextLine();
        System.out.println("Enter your surname: ");
        String surname = myObj.nextLine();
        System.out.println("Enter the total value of your order: ");
        float value = Float.parseFloat(myObj.next());
        System.out.println("Enter the amount you wish to pay as deposit: ");
        float deposit = Float.parseFloat(myObj.next());

        System.out.println("==Receipt==");
        System.out.println("Customer: "+firstname.substring(0,1)+" "+surname);
        System.out.println("Order Total:  £"+value);
        System.out.println("Deposit paid:  £"+deposit);
        System.out.format("Remainder:  £%.2f%n", (value - deposit));
    }
}
