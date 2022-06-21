package section4ExpressionsStatementsMethods;

public class methods {
    public static void main(String[] args) {
        int yourScore = calculateScore(true, 5000, 5, 100);
        System.out.println("Your final score was " + yourScore);

        yourScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + yourScore);

        int highScorePosition;
        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Joe", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Harry", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
            if (gameOver) {
            int finalScore = score + (levelCompleted * bonus) + 1000;
            finalScore += 1000;
            return finalScore;
        }
            return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the leaderboard.");
    }

    public static int calculateHighScorePosition(int score) {
        int highScorePosition = 4;
        if (score > 1000) {
            highScorePosition = 1;
        } else if (score > 500) {
            highScorePosition = 2;
        } else if (score > 100) {
            highScorePosition = 3;
        }
        return highScorePosition;
    }
}

// a conditional has to be false for it to reach the next conditional