package baseball_sim;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Simulation {

    public int[] homeInts, awayInts;
    public Team home, away;
    public League league;
    public Game game;
    public ScoreKeeper sk;

    public boolean buildTeam(String team1, String team2) {
        try {
            TeamBuilder teamBuilder = new TeamBuilder();
            home = teamBuilder.buildTeam(team1);
            away = teamBuilder.buildTeam(team2);
            LeagueBuilder leagueBuilder = new LeagueBuilder();
            league = leagueBuilder.buildLeague(home);

            sk = new ScoreKeeper();
            return true;
        } catch (Exception e1) {
            return false;
        }
    }

    public void play() {
        try {
            game = new Game();
            constructIntArrays();
            int iteration = 1;

            game.playGame(home, away, league, homeInts, awayInts);
            sk.updateMultisimStats(game);

            home.zeroOut();
            away.zeroOut();

        } catch (Exception error) {
            System.err.println("Fail simulation");
        }
    }

    private void constructIntArrays() {
        homeInts = new int[10];
        awayInts = new int[10];
        int i = 0;
        for (int k = 0; k < 9; k++) {
            homeInts[k] = k;
            awayInts[k] = k;
        }
        homeInts[9] = Utils.getIntRand(0, 8);
        awayInts[9] = Utils.getIntRand(0, 8);
    }
}

