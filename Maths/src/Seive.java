public class Seive {

    public static void main(String[] args) {

        int n = 40;                        // Upper limit for finding prime numbers
        boolean[] primes = new boolean[n + 1];
        // false = prime, true = not prime (we mark composites as true)

        sieve(n, primes);                  // Run the sieve algorithm
    }

    /**
     * Sieve of Eratosthenes:
     * -----------------------
     * This algorithm finds all prime numbers up to 'n'.
     *
     * Why the name "Sieve"?
     * ----------------------
     * A sieve is used to filter out unwanted things (like filtering sand or flour).
     * Similarly, this algorithm "filters out" composite numbers and leaves only primes.
     *
     * How it works:
     * -------------
     * 1. Assume all numbers are prime (false in array means prime).
     * 2. Start from 2 (first prime).
     * 3. For every prime i, mark all its multiples as not prime.
     * 4. Continue until i*i > n (optimization).
     *
     * Time Complexity:
     * ----------------
     * O(n log log n) — extremely efficient for generating primes up to n.
     *
     * Space Complexity:
     * -----------------
     * O(n) — we use a boolean array of size n+1.
     */
    static void sieve(int n, boolean[] primes) {

        // Loop from i = 2 up to √n
        for (int i = 2; i * i <= n; i++) {

            // If i is still unmarked → it's prime
            if (!primes[i]) {

                // Mark all multiples of i as not prime
                // Start at i*2 (because i*1 = i itself)
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;      // Mark composite
                }
            }
        }

        // Output all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
