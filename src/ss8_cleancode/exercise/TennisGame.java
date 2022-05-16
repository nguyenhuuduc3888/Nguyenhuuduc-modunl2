package ss8_cleancode.exercise;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int score1, int score2) {
        StringBuilder score = new StringBuilder();
        int tempScore ;

        if (score1 == score2) {
            switch (score1) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;

                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else {
            boolean check = score1 >= 4;
            boolean check1 = score2 >= 4;
            if (check || check1) {
                score = new StringBuilder(getString(score1, score2));
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = score1;
                    else {
                        score.append("-");
                        tempScore = score2;
                    }
                    switch (tempScore) {

                        case 0:
                            score.append("Love");
                            break;
                        case 1:
                            score.append("Fifteen");
                            break;
                        case 2:
                            score.append("Thirty");
                            break;
                        case 3:
                            score.append("Forty");
                            break;
                    }
                }
            }
        }
        return score.toString();
    }

    private static String getString(int m_score1, int m_score2) {
        String score;
        int minusResult = m_score1 - m_score2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}
