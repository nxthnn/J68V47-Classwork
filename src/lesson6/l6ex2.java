package lesson6;

import java.util.Scanner;
public class l6ex2 {

    public static void main(String[] args) {

        int option;
        do
        {
            System.out.println("1. Say hello\n2. tell me the time\n3. Tell me a joke\n4. Quit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an option (1-4): ");
            option = scanner.nextInt();
            System.out.println("Option selected: "+option);
            if (option ==1){
                System.out.println("Hello!!!");
            } else if (option == 2){
                System.out.println("TIME TO GET A WATCH!!!");
            }else if (option == 3){
                System.out.println("A guy walks into a bar... OUCH!");
            }
        } while(option !=4);




    }
}
