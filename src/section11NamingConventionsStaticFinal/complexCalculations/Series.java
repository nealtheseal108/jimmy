package section11NamingConventionsStaticFinal.complexCalculations;

public class Series {
    public static int nSum(int n) {
        if (n <= 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int product = 1;
        if (n <= 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 1;
        }
        int sum = 0;
        int firstPreviousIteration = 2;
        int secondPreviousIteration = 1;
        for (int i = 4; i <= n; i++) {
            sum = firstPreviousIteration + secondPreviousIteration;
            secondPreviousIteration = firstPreviousIteration;
            firstPreviousIteration = sum;
        }
        return sum;
    }
}
