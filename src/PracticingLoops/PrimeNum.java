package PracticingLoops;

public class PrimeNum {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 50 ; i++) {
            if (isPrime(i)){
                count++;
                System.out.printf("Number %d is a prime number", i);
            System.out.println();
            }
            if (count == 10){
                break;
            }



        }


    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }

        }

        return true;

    }
    }
