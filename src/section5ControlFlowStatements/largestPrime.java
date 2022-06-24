package section5ControlFlowStatements;

public class largestPrime {
    public static int getLargestPrime(int number) {
        int largestPrime = -1;
        int numberOfFactors = 0;
        for (int f = 2; f <= number; f++) {
            if (number % f == 0) {
                int factor = f;
                for (int t = 1; t <= factor; t++) {
                    if (factor % t == 0) {
                        numberOfFactors++;
                    }
                }
                if (numberOfFactors == 2) {
                    largestPrime = factor;
                    numberOfFactors = 0;
                }
            }
        }
        return largestPrime;
    }
}
