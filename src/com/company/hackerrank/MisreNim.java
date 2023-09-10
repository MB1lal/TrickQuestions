package com.company.hackerrank;

import java.util.List;

/**
 *Two people are playing game of Misère Nim. The basic rules for this game are as follows:
 * The game starts with  piles of stones indexed from  to . Each pile  (where ) has  stones.
 * The players move in alternating turns. During each move, the current player must remove one or more stones from a single pile.
 * The player who removes the last stone loses the game.
 * Given the value of  and the number of stones in each pile, determine whether the person who wins the game is the first or second person to move. If the first player to move wins, print First on a new line; otherwise, print Second. Assume both players move optimally.
 * Example
 *
 * In this case, player 1 picks a pile, player 2 picks a pile and player 1 has to choose the last pile. Player 2 wins so return Second.
 *
 * There is no permutation of optimal moves where player 2 wins. For example, player 1 chooses the first pile. If player 2 chooses 1 from another pile, player 1 will choose the pile with 2 left. If player 2 chooses a pile of 2, player 1 chooses 1 from the remaining pile leaving the last stone for player 2. Return First.
 */
public class MisreNim {
    public static String misereNim(List<Integer> s) {
        if(s.size() - ((int) s.stream().filter(x -> x==1).count()) == 0) {
            if(s.size() %2 ==0) {
                return "First";
            } else {
                return "Second";
            }
        }
        if(s.stream().reduce((x,y) -> x^y).get() == 0) {
            return "Second";
        } else {
            return "First";
        }
    }
}
