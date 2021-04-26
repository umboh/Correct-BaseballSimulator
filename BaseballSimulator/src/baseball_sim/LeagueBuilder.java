package baseball_sim;

import java.io.*;

public class LeagueBuilder {

    public LeagueBuilder() {
    }

    public League buildLeague(Team year) throws IOException {

        League l = new League();
        setStats(l);
        l.setLeagueOVA();
        return l;

    }

    private void setStats(League l) {
        l.BF = Utils.getIntRand(0, 700);
        l.Hit = Utils.getIntRand(0, 150);
        l.doubles = Utils.getIntRand(0, 50);
        l.triples = Utils.getIntRand(0, 10);
        l.HR = Utils.getIntRand(0, 30);
        l.singles = l.Hit - (l.doubles + l.triples + l.HR);
        l.BB = Utils.getIntRand(0, 80);
        l.SO = Utils.getIntRand(0, 200);
        l.HBP = Utils.getIntRand(0, 20);

    }

}
