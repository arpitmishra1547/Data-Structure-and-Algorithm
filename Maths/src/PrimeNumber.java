public class PrimeNumber {

    public static void main(String[] args) {

        int n = 13;  // Number to check for primality

        // Print whether n is prime or not
        System.out.println("Is " + n + " a prime number? " + isPrime(n));

        // OPTIONAL: Check all numbers from 2 to n
        /*
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " -> " + isPrime(i));
        }
        */
    }

    /**
     * Checks whether a given number 'n' is prime.
     *
     * Explanation of approach:
     * -------------------------
     * A prime number is a number greater than 1
     * that has no divisors except 1 and itself.
     *
     * We only check divisors up to √n because:
     * If 'n' has a factor greater than √n,
     * the other factor must be smaller than √n.
     *
     * Time Complexity:  O(√n)
     * Space Complexity: O(1)   (constant space)
     *
     * @param n The number to check
     * @return true if n is prime, otherwise false
     */
    static boolean isPrime(int n) {

        // Prime numbers must be greater than 1
        if (n <= 1) {
            return false;
        }

        // Start checking divisors from 2
        int divisor = 2;

        // Check only up to √n
        while (divisor * divisor <= n) {

            // If n is divisible by divisor → not prime
            if (n % divisor == 0) {
                return false;
            }

            divisor++;  // Move to the next possible divisor
        }

        // No divisors found → number is prime
        return true;
    }
}
