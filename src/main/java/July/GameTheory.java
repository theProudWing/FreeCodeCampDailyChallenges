/**
 * Created by: Ben Jones
 * Date:23/07/2026
 * Time:09:15
 */

package main.java.July;

public class GameTheory {

    /**
     * Given two equal length strings representing the strategies of two players in <a href="https://en.wikipedia.org/wiki/Prisoner%27s_dilemma">the prisoner's dilemma</a>
     * return an array containing the scores of both players.
     *
     *
     *
     * @param playerOneStrategy
     * @param playerTwoStrategy
     * @return
     */
    public int[] prisonersDilemmaResult(String playerOneStrategy, String playerTwoStrategy) throws IllegalArgumentException{
        if (playerOneStrategy.length() != playerTwoStrategy.length()){
            throw new IllegalArgumentException("Player strategies are of different lengths.");
        }
        int p1Score = 0;
        int p2Score = 0;

        for (int i = 0; i < playerOneStrategy.length(); i++) {

        }
        return new int[0];
    }
}
