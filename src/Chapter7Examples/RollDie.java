package Chapter7Examples;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNum = new SecureRandom();
        int [] frequency = new int[7];
        for (int roll = 1; roll <= 60_000_000 ; roll++) {
            ++frequency[randomNum.nextInt(6)+1];
        }
        System.out.printf("%s%10s%n", "face", "frequency");
        for (int face = 1; face < frequency.length ; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);

        }
    }
}
