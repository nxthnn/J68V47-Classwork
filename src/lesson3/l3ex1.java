package lesson3;

import java.util.Scanner;
public class l3ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Year of birth xxxx: ");
        String year = scanner.nextLine();

        String username =  firstName.substring(0,1) + surname.toLowerCase();
        System.out.println("Username: "+username);
        String password = surname.substring(0,1).toLowerCase() + firstName.substring(0,3).toUpperCase();
        System.out.println("Password: "+password);
    }
}
