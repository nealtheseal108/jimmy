package section5ControlFlowStatements;

public class sum3and5 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by 3 and 5.");
                count++;
                sum += i;
            }
            if (count == 5) {
                System.out.println("The sum of the first 5 numbers that are divisible by both 3 and 5 is " + sum + ".");
                break;
            }
        }

    }
}
