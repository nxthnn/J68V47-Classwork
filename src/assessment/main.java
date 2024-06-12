package assessment;

import java.util.Objects;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class main {

    public static final Map<String, Integer> teams = new HashMap<>();
    public static final Map<String, Integer> points = new HashMap<>(); // Track points for all teams
    public static final int MAX_POINTS = 33; // Maximum points cap
    public static String userTeam;
    public static int gamesPlayed = 0;

    public static final String[] teamNames = {
            "Celtic", "Rangers", "Aberdeen", "Hearts",
            "St.Mirren", "Kilmarnock", "Hibernian", "Dundee",
            "St.Johnstone", "Ross County", "Livingston", "Motherwell"
    };

    public static final int[] teamRatings = {
            90, 85, 80, 80,
            78, 76, 75, 67,
            72, 72, 74, 70
    };

    public static void main(String[] args) {
        initializeTeams();
        initializeRandomPoints();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pick your team. \nCeltic\nRangers\nAberdeen\nHearts\nKilmarnock\nSt.Mirren\nHibernian\nDundee\nSt.Johnstone\nRoss County\nLivingston\nMotherwell\n: ");
        userTeam = scanner.nextLine();

        if (!teams.containsKey(userTeam)) {
            System.out.println("Invalid team name");
            return;
        } else {
            System.out.println("Selected team: " + userTeam);
        }

        while (gamesPlayed < 11) {
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
                continue;
            }

            System.out.println("Please select a team to play from the list (Not your own team) \nCeltic\nRangers\nAberdeen\nHearts\nKilmarnock\nSt.Mirren\nHibernian\nDundee\nSt.Johnstone\nRoss County\nLivingston\nMotherwell\n:");
            String opponent = scanner.nextLine();

            if (Objects.equals(opponent, userTeam)) {
                System.out.println("Invalid choice");
                continue;
            } else if (!teams.containsKey(opponent)) {
                System.out.println("Invalid team name");
                continue;
            } else {
                simulateMatch(userTeam, opponent);
                gamesPlayed++;
            }
        }

        System.out.println("You have played 11 games. Season over!");
        displayLeagueTable();
        checkUserTeamPosition();
    }

    public static void initializeTeams() {
        for (int i = 0; i < teamNames.length; i++) {
            teams.put(teamNames[i], teamRatings[i]);
        }
    }

    public static void initializeRandomPoints() {
        Random random = new Random();
        for (String team : teams.keySet()) {
            int randomPoints = random.nextInt(MAX_POINTS + 1); // Random points between 0 and MAX_POINTS
            points.put(team, randomPoints);
        }
    }

    public static void simulateMatch(String userTeam, String opponent) {
        Random random = new Random();
        int userTeamRating = teams.get(userTeam);
        int opponentRating = teams.get(opponent);

        int userTeamScore = random.nextInt(userTeamRating / 10) + 1;
        int opponentScore = random.nextInt(opponentRating / 10) + 1;

        // Add +1 lead to the higher-rated team
        if (userTeamRating > opponentRating) {
            userTeamScore++;
        } else if (opponentRating > userTeamRating) {
            opponentScore++;
        }

        System.out.println(userTeam + " " + userTeamScore + " - " + opponentScore + " " + opponent);

        if (userTeamScore > opponentScore) {
            System.out.println("You won the match!");
            updatePoints(userTeam, 3); // Award 3 points for a win
        } else if (userTeamScore < opponentScore) {
            System.out.println("You lost the match.");
            updatePoints(opponent, 3); // Award 3 points for opponent's win
        } else {
            System.out.println("The match ended in a draw.");
            updatePoints(userTeam, 1); // Award 1 point for a draw
            updatePoints(opponent, 1); // Award 1 point for opponent's draw
        }
    }

    public static void updatePoints(String team, int pointsToAdd) {
        int currentPoints = points.get(team);
        int newPoints = Math.min(currentPoints + pointsToAdd, MAX_POINTS); // Ensure points do not exceed MAX_POINTS
        points.put(team, newPoints);
    }

    public static void displayLeagueTable() {
        // Create a list of teams and sort it by points in descending order
        List<Map.Entry<String, Integer>> leagueTable = new ArrayList<>(points.entrySet());
        leagueTable.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("League Table:");
        for (Map.Entry<String, Integer> entry : leagueTable) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " points");
        }
    }

    public static void checkUserTeamPosition() {
        int userTeamPoints = points.get(userTeam);

        // Create a list of teams sorted by points in descending order
        List<Map.Entry<String, Integer>> leagueTable = new ArrayList<>(points.entrySet());
        leagueTable.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Check if the user's team is at the top of the table
        if (leagueTable.get(0).getKey().equals(userTeam)) {
            System.out.println("Congratulations! Your team " + userTeam + " has won the league!");
        } else {
            System.out.println("Better luck next time! Your team " + userTeam + " did not win the league.");
        }
    }
}
