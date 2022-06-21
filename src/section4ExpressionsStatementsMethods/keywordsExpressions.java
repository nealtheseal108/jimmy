package section4ExpressionsStatementsMethods;

public class keywordsExpressions {
    public static void main(String[] args) {
        double miles = 0;
        double kilometers = miles * 1.61;

        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression.");
        }

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

       if (score < 5000 && score >= 1000) {
            System.out.println("Your score was less then 5000 but more than or equal to 1000.");
            System.out.println("This was executed.");
       } else if (score < 1000) {
            System.out.println("Your score was less then 1000.");
       } else {
            System.out.println("Got here.");
       }

       if (gameOver) {
           int finalScore = score + (levelCompleted * bonus) + 1000;
           System.out.println("Your final score was " + finalScore);
       }

       score = 10000;
       levelCompleted = 8;
       bonus = 200;

        if (gameOver) {
            int secondFinalScore = score + (levelCompleted * bonus);
            System.out.println("Your second final score was " + secondFinalScore);
        }

    }
}

// variable created inside a code block cannot be accessed outside it
// after a code block finishes running, all vars are deleted

