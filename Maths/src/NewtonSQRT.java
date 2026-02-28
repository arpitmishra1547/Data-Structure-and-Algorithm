public class NewtonSQRT {

    public static void main(String[] args) {

        // Print the approximate square root of 40
        System.out.println(sqrt(40));
    }

    /**
     * Computes the square root of a number using Newton–Raphson Method.
     *
     * Newton's Formula:
     *     root = 0.5 * (x + n/x)
     *
     * This formula repeatedly improves the guess 'x' until it stabilizes.
     *
     * @param n The number whose square root is to be calculated
     * @return Approximate square root of n
     */
    static double sqrt(double n) {

        double x = n;      // Initial guess (start with n itself)
        double root;       // Will store improved guess

        while (true) {

            // Newton's iteration formula: improves the guess
            root = 0.5 * (x + (n / x));

            // Check if the guess is close enough to previous guess
            // Math.abs() gives absolute difference.
            // If difference < 0.5 → we assume convergence (stop looping)
            if (Math.abs(root - x) < 0.5) {
                break;    // Stop the iteration when improvement is small
            }

            // Update x for the next iteration
            x = root;
        }

        // Return the final approximated square root
        return root;
    }
}
