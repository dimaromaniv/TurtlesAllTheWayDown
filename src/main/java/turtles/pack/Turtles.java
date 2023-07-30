package turtles.pack;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {
    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static int gcd2(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Instant start = Instant.now();
        gcd(1200003434,245346);
        Instant stop = Instant.now();
        double timeDuration = Duration.between(start,stop).getNano();
        System.out.println(" Duration in millis " + timeDuration);

        Instant start1 = Instant.now();
        gcd2(500434,234);
        Instant stop1 = Instant.now();
        long timeDuration1 = Duration.between(start1,stop1).toMillis();
        System.out.println(" Duration in millis " + timeDuration);

     }
}
