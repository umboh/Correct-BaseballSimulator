package baseball_sim;

import java.util.ArrayList;

public class Team {

    String name;

    ArrayList<Player> roster;
    ArrayList<Player> bullpen;

    public Team() {
        roster = new ArrayList<Player>();
        bullpen = new ArrayList<Player>();

    }

    public void setInfo(String name) {
        this.name = name;
    }

    public void addPlayer(Player input) {
        roster.add(input);
        if (input.position.equals("P")) {
            bullpen.add(input);
        }
    }

    public void zeroOut() {
        for (Player p : roster) {
            p.clearGameStats();
        }
    }

    public void setAverages() {
        for (Player p : roster) {
            p.setAvg();
        }
    }

    public String toString() {
        return name;
    }
}
