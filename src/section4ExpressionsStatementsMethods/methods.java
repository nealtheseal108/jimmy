package section4ExpressionsStatementsMethods;

public class methods {
    public static void main(String[] args) {
        int yourScore = calculateScore(true, 5000, 5, 100);
        System.out.println("Your final score was " + yourScore);

        yourScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + yourScore);
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
        System.out.println("Player " + playerName + " managed to get into position " + highScorePosition + " on the leaderboard.");
    }
}