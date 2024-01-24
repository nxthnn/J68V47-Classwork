package assessment;

import java.util.Scanner;
import java.util.Random;
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

        if(!teams.containsKey(userTeam)) {
            System.out.println("Invalid team name");
        } else {
            System.out.println("Selected team: " + userTeam);
        }
//This ensures that the team you select is from the text file
    }

    private static void initializeTeams() {
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

