package section4ExpressionsStatementsMethods;

public class methodOverloading {
    public static void main(String[] args) {

        int newScore = calculateScore("Neal", 50);
        System.out.println("New score is " + newScore);

        calculateScore(100);

        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(1, 1);
        if (centimeters < 0) {
            System.out.println("Invalid parameters.");
        }
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println(playerName + " scored " + score + " points.");
        return score;
    }

    public static int calculateScore(int score) {
        System.out.println("You scored " + score + " points.");
        return score;
    }

    public static int calculateScore() {
        System.out.println("Stop being a blongo.");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        int totalInches = inches + (feet * 12);
        double totalCentimeters = totalInches * 2.54;
        System.out.println(feet + " ft and " + inches + " inches = " + totalCentimeters + " cm");
        return totalCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches <= 0) {
            return -1;
        }
        int feet = (int)inches / 12;
        int remainingInches = (int)inches % 12;
        System.out.println(inches + " inches = " + feet + " ft and " + remainingInches + " inches.");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}

// overloaded methods are methods with the same name but with different parameters
// overloaded methods throw errors if the parameters of the two methods are the same but the return types are different
// calls to an overloaded method will run a specific implementation of the method
// method overloading improves code overloading and reusability
// easier to remember