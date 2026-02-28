public class BinarySearchSQRT {
    public static void main(String[] args) {

        int n = 40;   // Number whose square root we want
        int p = 3;    // Precision: number of decimal places

        // Print result with 6 digits after decimal
        System.out.printf("%.6f", sqrt(n, p));
    }

    /**
     * Computes square root using:
     * 1. Binary Search for integer part
     * 2. Incremental search for decimal precision
     *
     * Time Complexity: O(log n) for the integer part
     *                  O(p * 10) ~ O(p) for decimals
     *
     * @param n Number whose square root is needed
     * @param p Number of decimal places required
     * @return Square root of n up to p decimal places
     */
    static double sqrt(int n, int p) {

        int s = 0;      // Binary search start
        int e = n;      // Binary search end

        double root = 0.0;  // Will store closest integer part of sqrt

        // -------------------------------
        // 1️⃣ BINARY SEARCH FOR INTEGER PART
        // -------------------------------
        while (s <= e) {

            int m = s + (e - s) / 2;  // Midpoint

            if (m * m == n) {
                return m;            // Perfect square → return immediately
            }

            if (m * m > n) {
                e = m - 1;           // Search left half
            } else {
                s = m + 1;           // Search right half
                root = m;            // Closest integer sqrt found so far
            }
        }

        // -------------------------------
        // 2️⃣ DECIMAL PART USING INCREMENTAL SEARCH
        // -------------------------------

        double incr = 0.1;   // First decimal place

        for (int i = 0; i < p; i++) {

            // Increase root by 'incr' until root*root becomes > n
            while (root * root <= n) {
                root += incr;
            }

            // Step back one increment because we crossed the boundary
            root -= incr;

            // Move to next decimal place (0.1 → 0.01 → 0.001 ...)
            incr /= 10;
        }

        return root;
    }
}
