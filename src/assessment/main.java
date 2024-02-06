package assessment;

import java.util.Objects;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class main {

    public static final Map<String, Integer> teams = new HashMap<>();
    public static String userTeam;

    public static void main(String[] args) {
        initializeTeams();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pick your team. \nCeltic\nRangers\nAberdeen\nHearts\nKilmarnock\nSt.Mirren\nHIbernian\nDundee\nSt.Johnstone\nRoss County\nLivingston\n:");
        userTeam = scanner.nextLine();

        if (!teams.containsKey(userTeam)) {
            System.out.println("Invalid team name");
        } else {
            System.out.println("Selected team: " + userTeam);
        }
//This ensures that the team you select is from the text file

        System.out.print("Do you want to train (Y/N): ");
        String trainingInput = scanner.nextLine();

        if (trainingInput.equalsIgnoreCase("Y")) {
            int currentLevel = teams.get(userTeam);
            int trainingEffectiveness = (int) (Math.random() * 11) - 5; // Random number between -5 and 5
            int newLevel = currentLevel + trainingEffectiveness;
            teams.put(userTeam, newLevel);
            System.out.println("Your team rating is now " + newLevel);
        } else if (trainingInput.equalsIgnoreCase("N")) {
            int currentLevel = teams.get(userTeam);
            System.out.println("Your team did not train so your rating stayed at " + currentLevel);
        } else {
            System.out.println("Invalid input. Please enter Y or N.");
        }
        System.out.println("Please select a team to play from the list (Not your own team) \nCeltic\nRangers\nAberdeen\nHearts\nKilmarnock\nSt.Mirren\nHIbernian\nDundee\nSt.Johnstone\nRoss County\nLivingston\n:");
        String opponent = scanner.nextLine();

        if (Objects.equals(opponent, userTeam)) {
            System.out.println("Invalid choice");
        } else {
            System.out.println(userTeam+" v "+opponent+" will begin soon!");
        }



    }
    public static void initializeTeams() {
        teams.put("Celtic", 90);
        teams.put("Rangers", 85);
        teams.put("Aberdeen", 80);
        teams.put("Hearts", 80);
        teams.put("St.Mirren", 78);
        teams.put("Kilmarnock", 76);
        teams.put("Hibernian", 75);
        teams.put("Dundee", 67);
        teams.put("Motherwell", 70);
        teams.put("St.Johnstone", 72);
        teams.put("Ross County", 72);
        teams.put("Livingston", 74);
    }


}

