package com.greedyalgorithms.app;

public class Change {
    private int[] coins;

    public Change(int[] coins) {
        this.coins = coins;
    }

    public int getChange(int total) {
        int coinsUsed = 0;

        while (total > 0) {
            total = GreedyMath.extractBiggerValueFromTotal(total, coins);
            coinsUsed += 1;
        }

        return coinsUsed;
    }
}
