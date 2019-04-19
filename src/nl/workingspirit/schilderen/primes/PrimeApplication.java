package nl.workingspirit.schilderen.primes;

public class PrimeApplication {

    private static final int MAX = 100; // print the primes upto MAX

    public static void main(String[] args) {

        boolean[] primes = new boolean[MAX];

        // set all numbers to be a prime
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        // calculate the primes // streep alle veelvouden weg
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = 2 * i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }

        // print the primes
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.println(i);
            }
        }

    }

}
