package lesson2;

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Can you enter an item you bought and the price");
        String item1 = myObj.nextLine();
        float price1 = Float.parseFloat(myObj.next());

        Scanner myObj2 = new Scanner(System.in);

        System.out.println("Can you enter an item you bought and the price");
        String item2 = myObj2.nextLine();
        float price2 = Float.parseFloat(myObj2.next());

        Scanner myObj3 = new Scanner(System.in);

        System.out.println("Can you enter an item you bought and the price");
        String item3 = myObj3.nextLine();
        float price3 = Float.parseFloat(myObj3.next());

        System.out.println(item1 +"..... £" +price1);
        System.out.println(item2 +"..... £" +price2);
        System.out.println(item3 +"..... £" +price3);
        System.out.format("Subtotal... £%.2f%n", (price1 + price2+ price3 ));

    }
}
