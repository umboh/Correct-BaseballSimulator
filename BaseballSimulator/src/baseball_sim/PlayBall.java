package baseball_sim;

import java.util.Scanner;

public class PlayBall {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String team1, team2;
            System.out.print("Who is playing as the home team: ");
            team1 = scanner.nextLine();
            System.out.print("Who is playing as the away team: ");
            team2 = scanner.nextLine();

            if (team1 == null || team1.trim().isEmpty()) {
                System.err.println("Missing a team name.");
                return;
            }
            if (team2 == null || team2.trim().isEmpty()) {
                System.err.println("Missing a team name.");
                return;
            }

            Simulation sim = new Simulation();
            if (!sim.buildTeam(team1, team2)) {
                System.err.println("Could not build teams.");
                return;
            }
            sim.play();
        } catch (Exception e) {
            System.out.println("That is not right.");
        }
    }

}
