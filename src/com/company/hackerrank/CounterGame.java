package com.company.hackerrank;

/**
 * Louise and Richard have developed a numbers game. They pick a number and check to see if it is a power of . If it is, they divide it by . If not, they reduce it by the next lower number which is a power of . Whoever reduces the number to  wins the game. Louise always starts.
 * Given an initial value, determine who wins the game.
 * Example
 *
 * It's Louise's turn first. She determines that  is not a power of . The next lower power of  is , so she subtracts that from  and passes  to Richard.   is a power of , so Richard divides it by  and passes  to Louise. Likewise,  is a power so she divides it by  and reaches . She wins the game.
 * Update If they initially set counter to , Richard wins. Louise cannot make a move so she loses.
 */
public class CounterGame {
    static long leastPower;
    private static boolean isPower(long x) {
        long count = 0;
        long square;
        for (int i = 0; i <= x/2; i++) {
            square = (long) Math.pow(2,i);
            if(square > x) {
                break;
            } else {
                count = square;
            }
        }
        leastPower = count;
        return count == x;
    }

    public static String counterGame(long n) {
        String player = "Richard";
        if(n==1) {
            return player;
        }
        while(n > 1) {
            player = player.equals("Richard") ? "Louise" : "Richard";
            if(!isPower(n)) {
                n = n - leastPower;
            } else {
                n = n/2;
            }
        }
        return player;
    }
}
