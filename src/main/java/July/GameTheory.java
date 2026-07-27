/**
 * Created by: Ben Jones
 * Date:23/07/2026
 * Time:09:15
 */

package main.java.July;

public class GameTheory {

    /**
     * FreeCodeCamp Daily Challenge - 23-07-2026
     * <p>
     * Given two equal length strings representing the strategies of two players in <a href="https://en.wikipedia.org/wiki/Prisoner%27s_dilemma">the prisoner's dilemma</a>
     * return an array containing the scores of both players.
     * <p>
     * The string parameters must be comprised of one of two characters: "C" (cooperate) or "D" (defect).
     * <p>
     * Each character represents one round, scored as follows:
     * <ul>
     *     <li>If both players cooperate, each scores 3.</li>
     *     <li>If both players defect, each scores 1.</li>
     *     <li>If one player defects and the other cooperates, the defector scores 5 and the cooperator scores 0.</li>
     * </ul>
     *
     * @param playerOneStrategy a String representing the strategy of the first player.
     * @param playerTwoStrategy a String representing the strategy of the second player.
     * @return a two-item int[], containing the scores of the players: [playerOne, playerTwo]
     */
    public static int[] prisonersDilemmaResult(String playerOneStrategy, String playerTwoStrategy) throws IllegalArgumentException{
        // Different length strings throws Exception
        if (playerOneStrategy.length() != playerTwoStrategy.length()){
            throw new IllegalArgumentException("Player strategies are of different lengths.");
        }

        final int BOTH_COOPERATE = 3;
        final int BOTH_DEFECT = 1;
        final int TRAITOR = 5;
        final int BETRAYED = 0;

        int p1Score = 0;
        int p2Score = 0;

        for (int i = 0; i < playerOneStrategy.length(); i++) {
            char p1Strat = playerOneStrategy.charAt(i);
            char p2Strat = playerTwoStrategy.charAt(i);

            // Invalid char throws exception
            if ((p1Strat != 'D' && p1Strat != 'C') || (p2Strat != 'D' && p2Strat != 'C')){
                throw new IllegalArgumentException("Player strategy contains invalid character. Position "
                        + i + " - P1: " + p1Strat + "P2: " + p2Strat + ".");
            }

            switch (p1Strat){
                case 'D':
                    if (p2Strat == 'D'){ // both players defect
                        p1Score += BOTH_DEFECT;
                        p2Score += BOTH_DEFECT;
                    } else {
                        p1Score += TRAITOR; // p1 betrays p2
                        p2Score += BETRAYED;
                    }
                    break;
                case 'C':
                    if (p2Strat == 'C'){ // both players co-operate
                        p1Score += BOTH_COOPERATE;
                        p2Score += BOTH_COOPERATE;
                    } else { // p2 betrays p1
                        p2Score += TRAITOR;
                        p1Score += BETRAYED;
                    }
                    break;
            }

        }
        return new int[]{p1Score, p2Score};
    }
}
