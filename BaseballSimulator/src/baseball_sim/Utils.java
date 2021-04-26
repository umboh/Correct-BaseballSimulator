
package baseball_sim;

import java.util.Random;

public class Utils {

    public static double getDoubleRand(double min, double max) {
        return min + (max - min) * Math.random();
    }
    public static int getIntRand(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
