package baseball_sim;

import java.io.*;
import java.util.Scanner;

public class TeamBuilder {


    String[] POS = {"P", "C", "1B", "2B", "3B", "SS", "LF", "CF", "RF"};

    public TeamBuilder() {
    }

    public Team buildTeam(String name) throws IOException {

        Team t = new Team();
        t.setInfo(name);
        int player_num = 9;
        for (int i = 0; i < player_num; i++) {
            Player p = new Player("Player " + (i + 1));
            setBattingStats(i, p);
            setPitchingStats(p);
            setFieldingStats(p);
            t.addPlayer(p);
        }

        t.setAverages();
        return t;
    }

    public void setBattingStats(int index, Player p) {

        p.position = POS[index];

        double rand = Math.random();
        if (rand < 0.35) {
            p.LR = "B";
        } else if (rand >= 0.35 && rand < 0.7) {
            p.LR = "L";
        } else {
            p.LR = "R";
        }
        p.G = Utils.getIntRand(0, 20);
        p.PA = Utils.getIntRand(0, 700);
        p.AB = Utils.getIntRand(0, 600);
        p.Run = Utils.getIntRand(0, 100);
        p.Hit = Utils.getIntRand(0, 150);
        p.doubles = Utils.getIntRand(0, 50);
        p.triples = Utils.getIntRand(0, 10);
        p.HR = Utils.getIntRand(0, 30);
        p.RBI = Utils.getIntRand(0, 100);
        p.SB = Utils.getIntRand(0, 20);
        p.CS = Utils.getIntRand(0, 10);
        p.BB = Utils.getIntRand(0, 100);
        p.SO = Utils.getIntRand(0, 170);
        p.GDP = Utils.getIntRand(0, 30);
        p.HBP = Utils.getIntRand(0, 20);
        p.singles = p.Hit - ((p.doubles + p.triples + p.HR));
    }

    public void setPitchingStats(Player p) {
        p.W = Utils.getIntRand(0, 20);
        p.L = Utils.getIntRand(0, 20);
        p.pG = Utils.getIntRand(0, 80);
        p.GS = Utils.getIntRand(0, 40);
        p.SAV = Utils.getIntRand(0, 20);
        p.IP = Utils.getDoubleRand(0, 220);
        p.pHit = Utils.getIntRand(0, 220);
        p.pHR = Utils.getIntRand(0, 20);
        p.pBB = Utils.getIntRand(0, 100);
        p.pSO = Utils.getIntRand(0, 300);
        p.pHBP = Utils.getIntRand(0, 10);
        p.BF = Utils.getIntRand(0, 900);

    }

    public void setFieldingStats(Player p) {
        p.PO = Utils.getIntRand(0, 1000);
        p.ASS = Utils.getIntRand(0, 300);
        p.ERR = Utils.getIntRand(0, 30);
    }
}
