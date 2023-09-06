import java.util.Scanner; // import the Scanner class 

class Ex1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);


        // Enter username and press Enter
        System.out.println("Enter name and hobby");
        String name = myObj.nextLine();
        String hobby = myObj.nextLine();

        System.out.println("My friend " + name + " was a big fan of " + hobby +" he could do it all day and all night, he loved it so much that he got told he had to stop " + hobby + " and find a new thing to do");
    }
}